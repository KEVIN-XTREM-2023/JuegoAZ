/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

import clases.Jugador;
import static gestores.GestorJugadores.jugadores;
import java.util.Collections;
import ui.IngresoConsola;
import ui.Menus;
import ui.Titulos;

/**
 *
 * @author Shirley Torres, Kevin Saquinga, Edison López y Sebastián Palate
 */
public abstract class GestorJuego {

    /*
        2. Configuracion del Juego
        - Establecido por la aplicacion
        - Orden de registro de los jugadores
        - ¿Jugar con tiempo? (Aún No)
     */
    public static int tiempo;

    /**
     * Método que permite asignar una letra a los jugadores de acuerdo a la
     * opcion 3
     */
    public static void asignarLetra() {
        if (!jugadores.isEmpty()) {
            char opcion = Jugador.seleccionarOrden("\nOrden Establecido por la Aplicación o por Registro (A/R): ");
            if (opcion == 'A') {
                for (int i = 0; i < jugadores.size(); i++) {
                    int numeroABC = IngresoConsola.numeroAzar(0, 26);
                    jugadores.get(i).setLetra(IngresoConsola.cargadoLetras()[numeroABC]);
                }

                Collections.sort(jugadores, (Jugador j1, Jugador j2) -> {
                    if (j1.getLetra() < j2.getLetra()) {
                        return -1;
                    }
                    if (j1.getLetra() > j2.getLetra()) {
                        return 1;
                    }
                    return 0;
                });

            } else {
                for (int i = 0; i < jugadores.size(); i++) {
                    jugadores.get(i).setLetra(IngresoConsola.cargadoLetras()[i]);
                }
            }
        } else {
            System.out.println("\n\tNo hay Jugadores Registrados");
        }
    }

    public static void asignarTiempo() {
        if (!jugadores.isEmpty()) {
            char opcion = Jugador.seleccionarTiempo("Jugar con Tiempo (S/N): ");
            if (opcion == 'S') {
                tiempo = IngresoConsola.entero("Con cuantos segundos va a durar el turno?: ", 1, 180); // Hasta 3 minutos
            } else {
                tiempo = 0;
            }
        } else {
            System.out.println("\n\tNo hay Jugadores Registrados");
        }
    }


    /*
    3. Iniciar el Juego
        - Jugador ingresa una palabra
        - Jugador gana un punto si la palabra es válida, y pierde si la palabra no es válida
        - Jugadores evaluan la palabra
        - Evaluador le dice al sistema el resultado de la votacion
        - @FIN, se termina el juego
     */
    public static void inicio() {
        if (!GestorJugadores.jugadores.isEmpty()) {
            if (GestorJugadores.jugadores.size() != 1) {

                for (int i = 0; i < jugadores.size(); i++) {
                    if (GestorJugadores.jugadores.get(i).getLetra() == ' ') {
                        System.out.println("\tNo todos los Jugadores tienen un Orden Asignado\n");
                        return;
                    }
                }

                System.out.println("\tOrden de Juego de los Jugadores a Participar\n");
                GestorJugadores.listarJugadores();

                Jugador evaluador = GestorJugadores.seleccionarJugadorAlAzar();

                int k = 0;
                boolean ejecucion = true;

                while (ejecucion) {
                    System.out.print("\n\t──────────── " + "JUGANDO CON LA LETRA " + IngresoConsola.cargadoLetras()[k] + " ────────────");

                    for (int i = 0; i < GestorJugadores.jugadores.size(); i++) {
                        Titulos.subtitulo("Turno de " + GestorJugadores.jugadores.get(i).getAlias());
                        String palabra = IngresoConsola.texto("Ingrese la Palabra: ");

                        if (!palabra.equals("@FIN")) {
                            System.out.println("\n\tTurno de " + GestorJugadores.jugadores.get(i).getAlias() + " terminado.");
                        } else {
                            //ejecucion = false;
                            System.out.println("\t\nJuego Terminado");
                            GestorJugadores.imprimirReporteGeneral();
                            Menus.menuReportesAccion();
                            System.exit(0);
                        }
                    }

                    Titulos.subtitulo2("Evaluaciones");
                    System.out.println("\n\t\t¡" + evaluador.getAlias() + " es el Jugador Evaluador!");

                    for (int i = 0; i < GestorJugadores.jugadores.size(); i++) {
                        int aciertos = 0, fallas = 0;
                        char opinion = IngresoConsola.votacion("¿Apruebas la Palabra de " + GestorJugadores.jugadores.get(i).getAlias() + "? (S/N): ");

                        if (opinion == 'S') {
                            aciertos++;
                            int auxAciertos = jugadores.get(i).getAciertos();
                            jugadores.get(i).setAciertos(aciertos + auxAciertos);
                        } else {
                            fallas++;
                            int auxFallas = jugadores.get(i).getFallas();
                            jugadores.get(i).setFallas(fallas + auxFallas);
                        }
                    }
                    k++;
                    if (k == 27) {
                        k = 0;
                    }
                }
            } else {
                System.out.println("\tMinimo 2 Jugadores para Empezar el Juego\n");
            }
        } else {
            System.out.println("\tNo hay Jugadores Registrados, Seleccione la Opción 2\n");
        }
    }

}
