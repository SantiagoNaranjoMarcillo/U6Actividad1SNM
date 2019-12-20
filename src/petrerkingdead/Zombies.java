package petrerkingdead;

import java.util.Random;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class Zombies {

    public static final String ZOMBIE = "Z";

    public static int[][] posicionInicialZombies() {
        int[][] posicion = {{3, 1}, {3, 4}, {5, 6}};
        return posicion;
    }

    public static void mueveATodosLosZombies(int[][] posicion, int[][] escenario, int[] posicionSuperviviente) {
        Random rnd = new Random();

        int zombie = rnd.nextInt(2);;
        boolean correctoZombie = false;
        int movimientoRandom = rnd.nextInt(3);;
        int cont = 0;
        do {
            switch (movimientoRandom) {
                            case 0://arriba
                                if (Casillas.noHayLimite(escenario, posicion[zombie][0] - 1, posicion[zombie][1])
                                        && posicionSuperviviente[0] != posicion[zombie][0]
                                        && zombieNoChocar(posicion, zombie, movimientoRandom)) {
                                    posicion[zombie][0] -= 1;
                                    correctoZombie = true;
                                }

                                break;
                            case 1://abajo
                                if (Casillas.noHayLimite(escenario, posicion[zombie][0] + 1, posicion[zombie][1])
                                        && posicionSuperviviente[0] != posicion[zombie][0]
                                        && zombieNoChocar(posicion, zombie, movimientoRandom)) {
                                    posicion[zombie][0] += 1;
                                    correctoZombie = true;
                                }

                                break;
                            case 2://derecha
                                if (Casillas.noHayLimite(escenario, posicion[zombie][0], posicion[zombie][1] + 1)
                                        && posicionSuperviviente[1] != posicion[zombie][1]
                                        && zombieNoChocar(posicion, zombie, movimientoRandom)) {
                                    posicion[zombie][1] += 1;
                                    correctoZombie = true;
                                }

                                break;
                            case 3://izquierda
                                if (Casillas.noHayLimite(escenario, posicion[zombie][0], posicion[zombie][1] - 1)
                                        && posicionSuperviviente[1] != posicion[zombie][1]
                                        && zombieNoChocar(posicion, zombie, movimientoRandom)) {
                                    posicion[zombie][1] -= 1;
                                    correctoZombie = true;
                                }

                                break;
                        }
                    if (cont++ > 3)
                        movimientoRandom += 1;
                    if (cont == 3)
                        movimientoRandom = 0;
                    if (cont < 3)
                        zombie = rnd.nextInt(2);
                    if(cont == 8)
                        correctoZombie = true;

                } while (!correctoZombie);

            }
    
    private static boolean zombieNoChocar(int[][] posicionZombie, int zombie, int movimientoRandom) {
        for (int i = 0; i < posicionZombie.length; i++) {
            switch(movimientoRandom){
                case 0://arriba
                    if (posicionZombie[zombie][0] - 1 == posicionZombie[i][0] 
                            && posicionZombie[zombie][1] == posicionZombie[i][1]){
                        return false;}
                    break;

                case 1://abajo
                    if (posicionZombie[zombie][0] + 1 == posicionZombie[i][0] 
                            && posicionZombie[zombie][1] == posicionZombie[i][1]){
                        return false;}
                    break;

                case 2://derecha
                    if (posicionZombie[zombie][0] == posicionZombie[i][0] 
                            && posicionZombie[zombie][1] + 1 == posicionZombie[i][1]){
                        return false;}

                case 3://izquierda
                    if (posicionZombie[zombie][0] == posicionZombie[i][0] 
                            && posicionZombie[zombie][1] - 1 == posicionZombie[i][1]){
                        return false;}
                    break;
            }          
        }
        return true;
    }
}
