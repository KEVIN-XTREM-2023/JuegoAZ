/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import gestores.GestorJuego;
import gestores.GestorJugadores;
import java.io.FileNotFoundException;

/**
 *
 * @author Shirley Torres, Kevin Saquinga, Edison López y Sebastián Palate
 */
public class Menus {

    /**
     * Métodos que permite el retorno de un valor comprendido entre 1 y 5
     *
     * @return
     */
    public static int mostrarMenuPrincipal() {
        int opcion;
        Titulos.titulo("Juego A - Z");
        System.out.printf("\t%s\n\t%s\n\t%s\n\t%s\n",
                "1. Jugar",
                "2. Jugadores",
                "3. Configuración",
                "4. Salir");
        opcion = IngresoConsola.entero("Opción: ", 1, 4);
        System.out.println("");
        return opcion;
    }

    public static void menuPrincipalAccion() throws FileNotFoundException {
        int opcion;
        do {
            opcion = mostrarMenuPrincipal();
            if (opcion != 4) {
                switch (opcion) {
                    case 1:
                        GestorJuego.inicio();
                        break;

                    case 2:
                        menuJugadoresAccion();
                        break;

                    case 3:
                        menuConfiguracionAccion();
                }
            }
        } while (opcion != 4);
    }

    public static int mostrarMenuJugadores() {
        int opcion;
        Titulos.titulo("Jugadores");
        System.out.printf("\t%s\n\t%s\n\t%s\n\t%s\n",
                "1. Insertar Jugadores",
                "2. Modificar cliente",
                "3. Eliminar cliente",
                "4. Regresar al Menú Principal");
        opcion = IngresoConsola.entero("Opción: ", 1, 4);
        System.out.println("");
        return opcion;
    }

    public static void menuJugadoresAccion() {
        int opcion;
        do {
            opcion = mostrarMenuJugadores();
            if (opcion != 4) {
                switch (opcion) {
                    case 1:
                        GestorJugadores.insertarJugador();
                        break;
                    case 2:
                        GestorJugadores.modificarJugador();
                        break;
                    case 3:
                        GestorJugadores.eliminarJugador();
                }
            }
        } while (opcion != 4);
    }

    private static int mostrarMenuConfiguracion() {
        int opcion;
        Titulos.titulo("Configuración");
        System.out.printf("\t%s\n\t%s\n\t%s\n",
                "1. Orden de Juego",
                "2. Tiempo",
                "3. Regresar al Menú Principal");
        opcion = IngresoConsola.entero("Opción: ", 1, 3);
        System.out.println("");
        return opcion;
    }

    private static void menuConfiguracionAccion() throws FileNotFoundException {
        int opcion;
        do {
            opcion = mostrarMenuConfiguracion();
            if (opcion != 3) {
                switch (opcion) {
                    case 1:
                        GestorJuego.asignarLetra();
                        break;
                    case 2:
                        GestorJuego.asignarTiempo();
                }
            }
        } while (opcion != 3);
    }

    public static int mostrarMenuReportes() {
        int opcion;
        Titulos.titulo("Reportes");
        System.out.printf("\t%s\n\t%s\n",
                "1. Reporte por Jugador",
                "2. Salir");
        opcion = IngresoConsola.entero("Opción: ", 1, 2);
        System.out.println("");
        return opcion;
    }

    public static void menuReportesAccion() {
        int opcion;
        do {
            opcion = mostrarMenuReportes();
            if (opcion != 2) {
                switch (opcion) {
                    case 1:
                        GestorJugadores.imprimirReporteJugador();
                }
            }
        } while (opcion != 2);
    }
}
