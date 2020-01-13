package petrerkingdead;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class Casillas {

    private static final int TIPO_VACIA = 1;
    private static final int TIPO_LIMITE = 2;
    private static final int TIPO_ITEM = 3;

    public static int[][] creaCasillasEscenarioJuego() {
        int lmte = TIPO_LIMITE;
        int item = TIPO_ITEM;
        int nada = TIPO_VACIA;
        int[][] casillas = new int[][]{
            {lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte},
            {lmte, item, item, item, nada, nada, nada, nada, nada, nada, nada, nada, nada, nada, item, lmte},
            {lmte, item, lmte, lmte, item, lmte, lmte, lmte, item, item, item, lmte, lmte, lmte, item, lmte},
            {lmte, item, item, item, item, item, nada, nada, nada, nada, nada, nada, nada, nada, nada, lmte},
            {lmte, item, lmte, lmte, item, lmte, item, lmte, lmte, lmte, lmte, lmte, item, lmte, item, lmte},
            {lmte, item, nada, nada, nada, lmte, nada, nada, nada, nada, nada, nada, nada, lmte, item, lmte},
            {lmte, lmte, lmte, lmte, item, lmte, lmte, lmte, item, lmte, item, lmte, lmte, lmte, item, lmte},
            {lmte, lmte, lmte, lmte, item, lmte, item, item, item, item, item, item, item, lmte, item, lmte},
            {lmte, lmte, lmte, lmte, item, item, item, lmte, lmte, lmte, lmte, lmte, item, item, item, lmte},
            {lmte, lmte, lmte, lmte, item, lmte, nada, nada, nada, nada, nada, nada, nada, lmte, item, lmte},
            {lmte, lmte, lmte, lmte, item, lmte, lmte, lmte, item, lmte, item, lmte, lmte, lmte, item, lmte},
            {lmte, item, item, item, item, lmte, item, item, item, lmte, item, item, item, lmte, item, lmte},
            {lmte, item, lmte, lmte, item, lmte, item, lmte, lmte, lmte, lmte, lmte, item, lmte, item, lmte},
            {lmte, item, item, item, item, item, item, item, item, item, item, item, item, item, item, lmte},
            {lmte, item, lmte, lmte, item, lmte, lmte, lmte, item, lmte, item, lmte, lmte, lmte, item, lmte},
            {lmte, item, item, item, nada, nada, nada, nada, nada, lmte, nada, nada, nada, nada, nada, lmte},
            {lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte, lmte}
        };
        return casillas;
    }

    public static boolean noHayLimite(int[][] escenario, int x, int y) {
        return escenario[x][y] != TIPO_LIMITE;
    }

    public static boolean hayItem(int[][] escenario, int x, int y) {
        return escenario[x][y] != TIPO_ITEM;
    }

    public static void vaciaCasilla(int[][] escenario, int x, int y) {
        escenario[x][y] = TIPO_VACIA;
    }

    public static String casillaATexto(int[][] escenario, int x, int y) {
        if (escenario[x][y] == TIPO_VACIA) 
            return " ";
        else if (escenario[x][y] == TIPO_ITEM) 
            return "\u001b[33;1m·\u001b[0m";
        else if (escenario[x][y] == TIPO_LIMITE) 
            return "\u001b[40;1m\"\u001b[0m";
         else 
            return "";
    }
}
