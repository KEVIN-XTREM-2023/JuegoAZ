/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author Shirley Torres, Kevin Saquinga, Edison López y Sebastián Palate
 */
public class IngresoConsola {

    /**
     * Método para mostrar un texto pasado por parámero añadido la palabra ERROR
     *
     * @param error
     */
    public static void msgError(String error) {
        System.out.printf("%5s%s%s\n", "", "ERROR: ", error);
    }

    /**
     * Método para mostrar un texto con formato
     *
     * @param msg
     * @return
     */
    public static String texto(String msg) {
        String cadena;
        Scanner tecla = new Scanner(System.in);
        System.out.printf("%5s%s", "", msg);
        cadena = tecla.nextLine().trim();
        return cadena;
    }

    /**
     * Método para el ingreso pasado por parametro un texto a mostrar con
     * valores maximos de entrada
     *
     * @param msg
     * @param min
     * @param max
     * @return
     */
    public static int entero(String msg, int min, int max) {
        int valor = 0;
        Scanner tecla = new Scanner(System.in);
        do {
            System.out.printf("\n%5s%s", "", msg);
            try {
                valor = Integer.valueOf(tecla.nextLine().trim());
            } catch (NumberFormatException e) {
                msgError("Ingresar solo números enteros ...");
                valor = -1;
            }
            if (valor < min || valor > max) {
                msgError("Ingresar solo valores comprendidos entre " + min + " y " + max);
            }
        } while (valor < min || valor > max);
        return valor;
    }

    /**
     * Método para validar un char
     *
     * @param msg
     * @return
     */
    public static char caracter(String msg) {
        String aux;
        char caracter;
        Scanner tecla = new Scanner(System.in);
        do {
            System.out.printf("%5s%s", "", msg);
            aux = tecla.nextLine().trim().toUpperCase();
            if (aux.length() != 1) {
                msgError("Ingresar solo un caracter alfanumérico");
            }
        } while (aux.length() != 1);
        caracter = aux.charAt(0);
        return caracter;
    }

    /**
     * Método para la toma de decicion a partir de un S y N
     *
     * @param msg
     * @return
     */
    public static char votacion(String msg) {
        char op;
        do {
            op = caracter(msg);
            if (op != 'S' && op != 'N') {
                msgError("Ingresar \"S\" si la palabra es \"VÁLIDA\" o \"N\" si \"NO ES VÁLIDA\"...");
            }
        } while (op != 'S' && op != 'N');
        return op;
    }

    public static char[] cargadoLetras() {
        char[] letras = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        return letras;
    }

    /**
     * Método de generacion de numeros aleatorios
     *
     * @param inferior
     * @param superior
     * @return
     */
    public static int numeroAzar(int inferior, int superior) {
        int numeroAzar;
        numeroAzar = (int) (Math.random() * (superior - inferior) + inferior + 1); //rango de valores
        return numeroAzar;
    }
}
