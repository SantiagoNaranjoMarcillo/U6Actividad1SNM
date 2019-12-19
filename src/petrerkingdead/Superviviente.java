package petrerkingdead;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class Superviviente {

    public static final String SUPERVIVIENTE = "S";

    public static int[] posicionInicialSuperviviente() {
        int[] posicion = {2, 1};
        return posicion;
    }

    public static void mueveSuperviviente(int[] posicion, char respuesta, int[][] escenario) {
        if (respuesta == 'w' //Arriba
                && Casillas.noHayLimite(escenario, posicion[0] - 1, posicion[1])
                && Casillas.vaciaCasilla(escenario, posicion[0], posicion[1])) {
            posicion[0] -= 1; 
        } else if (respuesta == 's'//Abajo
                && Casillas.noHayLimite(escenario, posicion[0] + 1, posicion[1])
                && Casillas.vaciaCasilla(escenario, posicion[0], posicion[1])) {
            posicion[0] += 1;
        } else if (respuesta == 'a'//Derecha
                && Casillas.noHayLimite(escenario, posicion[0], posicion[1] - 1)
                && Casillas.vaciaCasilla(escenario, posicion[0], posicion[1])) {
            posicion[1] -= 1;
        } else if (respuesta == 'd'//Izquierda
                && Casillas.noHayLimite(escenario, posicion[0], posicion[1] + 1)
                && Casillas.vaciaCasilla(escenario, posicion[0], posicion[1])) {
            posicion[1] += 1;
        }
    }
}
