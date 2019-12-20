package testpetrerkingdead;

import petrerkingdead.Zombies;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class testZombies {

    private static final int TIPO_VACIA = 1;
    private static final int TIPO_LIMITE = 2;
    private static final int TIPO_ITEM = 3;

    public static void main(String[] args) {
        /* Pruebas */
        testZombies programa = new testZombies();
        programa.inicio();

    }

    public void inicio() {

        int lmte = TIPO_LIMITE;
        int item = TIPO_ITEM;
        int nada = TIPO_VACIA;
        
        int[][] escenario = new int[][]{
            {lmte, lmte, lmte, lmte, lmte},
            {lmte, item, item, item, lmte},
            {lmte, item, lmte, lmte, lmte},
            {lmte, item, item, item, lmte},
            {lmte, lmte, lmte, lmte, lmte},
        };
        
        int[] posicionSuperviviente = {1, 1};
        int[][] posicionZombie = {{3, 2}, {3, 1}, {3, 3}};
        Zombies.mueveATodosLosZombies(posicionZombie, escenario, posicionSuperviviente);
        for (int i = 0; i < posicionZombie.length; i++) {
            for (int j = 0; j < posicionZombie[i].length; j++) {
                System.out.print("[" + posicionZombie[i][j] + "]");
            }
            System.out.println("");
        }

    }  
}
