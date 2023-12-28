/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author sebas
 */
public class Titulos {

    public static void titulo(String titulo) {
        int longitud, i;
        longitud = titulo.length();

        for (i = 1; i <= 50 - longitud; i++) {
            System.out.print(" ");
        }
        for (i = 1; i <= longitud; i++) {
            System.out.print("─");
        }
        System.out.println("");

        System.out.printf("%50S\n", titulo);

        for (i = 1; i <= 50 - longitud; i++) {
            System.out.print(" ");
        }
        for (i = 1; i <= longitud; i++) {
            System.out.print("─");
        }
        System.out.println(" ");
    }

    public static void subtitulo(String subtitulo) {
        System.out.printf("\n%20s%s%S%s\n\n", " ", "■  ", subtitulo, "  ■");
    }
    
    public static void subtitulo2(String subtitulo) {
        System.out.printf("\n%20s%s%S%s\n", " ", "────  ", subtitulo, "  ────");
    }

}   
