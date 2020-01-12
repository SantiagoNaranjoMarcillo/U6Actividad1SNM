package testpetrerkingdead;

import petrerkingdead.Partida;
import static petrerkingdead.Partida.imprimirEstadoPartida;
import petrerkingdead.Superviviente;
import petrerkingdead.Zombies;

/**
 *
 * @author Santiaog Naranjo Marcillo
 */
public class testPartida {

    private static final int TIPO_VACIA = 1;
    private static final int TIPO_LIMITE = 2;
    private static final int TIPO_ITEM = 3;

    public static void main(String[] args) {
        /* Pruebas */
        testPartida programa = new testPartida();
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
        int[] superviviente = Superviviente.posicionInicialSuperviviente();
        int[][] zombie = Zombies.posicionInicialZombies();
        Partida.puntuacionSuperviente(escenario, superviviente);
        
        imprimirEstadoPartida(escenario, superviviente, zombie);
    }
}
