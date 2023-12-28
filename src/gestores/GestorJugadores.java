/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

import clases.Jugador;
import java.util.ArrayList;
import java.util.Collections;
import ui.IngresoConsola;

/**
 *
 * @author Shirley Torres, Kevin Saquinga, Edison López y Sebastián Palate
 */
public class GestorJugadores {

    /*
        1. Registrar al Jugador
        - Para iniciar el juego hay que registrarse

     */
    public static ArrayList<Jugador> jugadores = new ArrayList<>();

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static boolean insertarJugador() {
        String alias;
        Jugador nuevoJugador = null;
        alias = IngresoConsola.texto("Ingrese Alias: ");
        if (!"".equals(alias)) {
            try {
                nuevoJugador = new Jugador(alias);
            } catch (Exception ex) {
                System.out.println("Error de Inserción");
            }
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).equals(nuevoJugador)) {
                    System.out.print("\n\tJugador ya existente");
                    System.out.print("\n\tNo se puede registrar con el mismo Alias\n");
                    return false;
                }
            }
            jugadores.add(nuevoJugador);
            listarJugadores();
            return true;
        }
        System.out.println("Jugador Inválido");
        return false;
    }

    public static void listarJugadores() {
        if (!jugadores.isEmpty()) {
            System.out.printf("\n%-3s%-3s%3s%-10s\n",
                    "", "Nº", "", "ALIAS");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.printf("%-3s%d%s%-3s%-10s\n",
                        "", i + 1, ". ",
                        "", jugadores.get(i).getAlias());
            }
        } else {
            System.out.println("\tNo hay Jugadores Registrados");
        }
    }

    public static Jugador seleccionarJugador() {
        if (!jugadores.isEmpty()) {
            listarJugadores();
            int numeroJugador = IngresoConsola.entero("Nº del Jugador: ", 1, jugadores.size());
            return jugadores.get(numeroJugador - 1);
        }
        return null;
    }

    public static boolean modificarJugador() {
        if (!jugadores.isEmpty()) {
            Jugador nuevoJugador = seleccionarJugador();
            if (nuevoJugador != null) {
                String nuevoAlias;
                System.out.println("Para mantener la información del jugador presione enter ... ");
                nuevoAlias = IngresoConsola.texto("Nuevo Alias para " + nuevoJugador.getAlias() + ": ");
                if (!"".equals(nuevoAlias)) {
                    nuevoJugador.setAlias(nuevoAlias);
                    return true;
                }
            }
        } else {
            System.out.println("\tNo hay Jugadores Registrados");
        }
        return false;
    }

    public static boolean eliminarJugador() {
        if (!jugadores.isEmpty()) {
            Jugador j = seleccionarJugador();
            if (j != null) {
                System.out.println("\t\nSe elimino a " + j.getAlias() + " del Juego.");
                jugadores.remove(j);
                return true;
            }
        } else {
            System.out.println("\tNo hay Jugadores Registrados");
        }
        return false;
    }

    public static Jugador seleccionarJugadorAlAzar() {
        if (!jugadores.isEmpty()) {
            return jugadores.get(IngresoConsola.numeroAzar(0, jugadores.size() - 1));
        }
        return null;
    }

    public static void imprimirReporteGeneral() {
        if (!jugadores.isEmpty()) {

            for (int i = 0; i < jugadores.size(); i++) {
                int aciertos = jugadores.get(i).getAciertos();
                int fallas = jugadores.get(i).getFallas();
                int total = aciertos - fallas;
                jugadores.get(i).setPuntos(total);
            }

            Collections.sort(jugadores, (Jugador j1, Jugador j2) -> {
                if (j1.getPuntos() > j2.getPuntos()) {
                    return -1;
                }
                if (j1.getPuntos() < j2.getPuntos()) {
                    return 1;
                }
                return 0;
            });

            System.out.println("\n\t¡El Ganador es " + jugadores.get(0).getAlias() + "!\n");
            System.out.printf("%-3s%-3s%3s%-10s%-3s%-10s%-3s%-10s%3s%-10s\n",
                    "", "Nº", "", "ALIAS", "", "ACIERTOS", "", "FALLAS", "", "TOTAL");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.printf("%3s%d%s%3s%-10s%-3s%-10d%-3s%-10d%-3s%-10d\n",
                        "", i + 1, ". ",
                        "", jugadores.get(i).getAlias(),
                        "", jugadores.get(i).getAciertos(),
                        "", jugadores.get(i).getFallas(),
                        "", jugadores.get(i).getPuntos());
            }
        } else {
            System.out.println("No hay Jugadores Registrados");
        }
    }

    public static void imprimirReporteJugador() {
        if (!jugadores.isEmpty()) {

            for (int i = 0; i < jugadores.size(); i++) {
                int aciertos = jugadores.get(i).getAciertos();
                int fallas = jugadores.get(i).getFallas();
                int total = aciertos - fallas;
                jugadores.get(i).setPuntos(total);
            }

            Jugador jugador = seleccionarJugador();
            System.out.printf("\n%-3s%-3s%3s%-10s%-3s%-10s%-3s%-10s%3s%-10s\n",
                    "", "Nº", "", "ALIAS", "", "ACIERTOS", "", "FALLAS", "", "TOTAL");
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).equals(jugador)) {
                    System.out.printf("%3s%d%s%3s%-10s%-3s%-10d%-3s%-10d%-3s%-10d\n",
                            "", i + 1, ". ",
                            "", jugadores.get(i).getAlias(),
                            "", jugadores.get(i).getAciertos(),
                            "", jugadores.get(i).getFallas(),
                            "", jugadores.get(i).getPuntos());
                }
            }
            System.out.println("");
        }
    }

}
