package petrerkingdead;

/**
 *
 * @author Santiago Naranjo Marcillo
 */
public class PetrerkingDead {

    public static int VIDAS = 1;
    public static int PUNTUACION = 0;

    public static void main(String[] args) {
        boolean ganarPartida = false;
        boolean pederPartida = false;
        
        int escenario[][] = Casillas.creaCasillasEscenarioJuego();
        int posicionSuperviviente[] = Superviviente.posicionInicialSuperviviente();
        int posicionZombies[][] = Zombies.posicionInicialZombies();
        
        String respuesta = "";

        do {
            PUNTUACION += Partida.puntuacionSuperviente(escenario, posicionSuperviviente);       
            VIDAS -= Partida.numeroVidas(posicionSuperviviente, posicionZombies);

            Partida.imprimirEstadoPartida(escenario, posicionSuperviviente, posicionZombies, PUNTUACION, VIDAS);
            ganarPartida = Partida.partidaGanada(PUNTUACION);
            pederPartida = Partida.partidaPerdida(VIDAS);
            if(pederPartida || respuesta.equalsIgnoreCase("H") || ganarPartida)
                break;
            if ((Partida.numeroVidas(posicionSuperviviente, posicionZombies)) == 1) {
                posicionSuperviviente = Superviviente.posicionInicialSuperviviente();
                posicionZombies = Zombies.posicionInicialZombies();
            }
            
            respuesta = Partida.pedirMovimientoCorrecto();
            Partida.mueveATodosPersonajes(posicionZombies, posicionSuperviviente, respuesta, escenario);
            
            
        } while (!ganarPartida);
    }
}
