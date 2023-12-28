/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import static ui.IngresoConsola.caracter;
import static ui.IngresoConsola.msgError;

/**
 *
 * @author Shirley Torres, Kevin Saquinga, Edison López y Sebastián Palate
 */
public class Jugador {

    /*
    1. Registrar al Jugador
        - Para iniciar el juego hay que registrarse
    
    2. Configuracion del Juego
        - Establecido por la aplicacion
        - Orden de registro de los jugadores
        - ¿Jugar con tiempo? (S/N) Espeficicar valor
    
    3. Iniciar el Juego
        - Jugador ingresa una palabra
        - Jugador gana un punto si la palabra es válida, y pierde si la palabra no es válida
        - Jugadores evaluan la palabra
        - Evaluador le dice al sistema el resultado de la votacion
        - @FIN, se termina el juego
    
    4. Reportes
        - Ganador por puntos de forma decendente
        - por jugador mostrando sus aciertos y fallas
        - Solo se genera cuando se termina el juego.
     */
    private String alias;
    private char letra;
    private int aciertos;
    private int fallas;
    private int puntos;

    public Jugador(String alias) {
        this.alias = alias;
        this.letra = ' ';
        this.aciertos = 0;
        this.fallas = 0;
        this.puntos = 0;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getFallas() {
        return fallas;
    }

    public void setFallas(int fallas) {
        this.fallas = fallas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = this.aciertos - this.fallas;
    }

    /**
     * Método usado para comparar al jugador, usado en el gestor para no crear
     * otro jugador con el mismo alias
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Jugador) {
            return this.alias.equals(((Jugador) o).alias);
        }
        return false;
    }

    public static char seleccionarOrden(String msg) {
        char opcion;
        do {
            opcion = caracter(msg);
            if (opcion != 'A' && opcion != 'R') {
                msgError("Ingresar \"A\" si la asiganción es \"por la APLICACION\" o \"R\" si la asignación es \"REGISTRO\"...");
            }
        } while (opcion != 'A' && opcion != 'R');
        return opcion;
    }

    public static char seleccionarTiempo(String msg) {
        char opcion;
        do {
            opcion = caracter(msg);
            if (opcion != 'S' && opcion != 'N') {
                msgError("Ingresar \"S\" si se va a jugar \"CON TIEMPO\" o \"N\" si se va a jugar \"SIN TIEMPO\" ...");
            }
        } while (opcion != 'S' && opcion != 'N');
        return opcion;
    }
}
