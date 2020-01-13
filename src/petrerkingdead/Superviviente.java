package petrerkingdead;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class Superviviente {

    public static final String SUPERVIVIENTE = "S";

    public static int[] posicionInicialSuperviviente() {
        int[] posicion = {1, 8};
        return posicion;
    }

    public static void mueveSuperviviente(int[] posicion, String respuesta, int[][] escenario) {
        if (respuesta.equalsIgnoreCase("W") //Arriba
                && Casillas.noHayLimite(escenario, posicion[0] - 1, posicion[1])) {
            posicion[0] -= 1; 
        } else if (respuesta.equalsIgnoreCase("S")//Abajo
                && Casillas.noHayLimite(escenario, posicion[0] + 1, posicion[1])) {
            posicion[0] += 1;
        } else if (respuesta.equalsIgnoreCase("A")//Derecha
                && Casillas.noHayLimite(escenario, posicion[0], posicion[1] - 1)) {
            posicion[1] -= 1;
        } else if (respuesta.equalsIgnoreCase("D")//Izquierda
                && Casillas.noHayLimite(escenario, posicion[0], posicion[1] + 1)) {
            posicion[1] += 1;
        }
    }
}
