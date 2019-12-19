package testpetrerkingdead;

import petrerkingdead.Casillas;
import petrerkingdead.Superviviente;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class testSuperviviente {
    
    private static final int TIPO_VACIA = 1;
    private static final int TIPO_LIMITE = 2;
    private static final int TIPO_ITEM = 3;

    public static void main(String[] args) {
        /* Pruebas */
        testSuperviviente programa = new testSuperviviente();
        programa.inicio();

    }

    public void inicio() {
    int lmte = TIPO_LIMITE;
        int item = TIPO_ITEM;
        int nada = TIPO_VACIA;
        int[][] escenario = new int[][]{
            {lmte, lmte, lmte, lmte, lmte},
            {lmte, item, item, item, lmte},
            {lmte, item, item, lmte, lmte},
            {lmte, item, item, item, lmte},
            {lmte, lmte, lmte, lmte, lmte},
        }; 
        int[] posicion = {2, 1};
        boolean comprobar = false;
        System.out.println(comprobar = moverArriba(posicion, escenario));
        System.out.println(comprobar = moverAbajo(posicion, escenario));
        System.out.println(comprobar = moverDerecha(posicion, escenario));
        System.out.println(comprobar = moverIzquierdaa(posicion, escenario));

    }
    private boolean moverArriba(int[] posicion, int[][] escenario) {
        posicion[0] = 2; posicion[1] = 1;
        Superviviente.mueveSuperviviente(posicion, 'w', escenario);
        return posicion[0] == 1 && posicion[1] == 1;
    }
    private boolean moverAbajo(int[] posicion, int[][] escenario) {
        posicion[0] = 2; posicion[1] = 1;
        Superviviente.mueveSuperviviente(posicion, 's', escenario);
        return posicion[0] == 3 && posicion[1] == 1;
    }
    private boolean moverDerecha(int[] posicion, int[][] escenario) {
        posicion[0] = 2; posicion[1] = 1;
        Superviviente.mueveSuperviviente(posicion, 'a', escenario);
        return posicion[0] == 2 && posicion[1] == 1;
    }
    private boolean moverIzquierdaa(int[] posicion, int[][] escenario) {
        posicion[0] = 2; posicion[1] = 1;
        Superviviente.mueveSuperviviente(posicion, 'd', escenario);
        return posicion[0] == 2 && posicion[1] == 2;
    }
}
