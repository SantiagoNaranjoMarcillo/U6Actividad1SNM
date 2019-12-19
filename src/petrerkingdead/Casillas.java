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
}
