public class Juez
{
    private int puntajeJugadorManual;
    private int puntajeJugadorInteligente;
    private int puntajeJugadorSet;
    private int puntajeJugadorInteligenteSet;
    private int tirosDisponibles;
    private int cantidadSets;
    private int tirosSet;
    public int getTirosDisponibles(){
        return tirosDisponibles;
    }
        public int getPuntaje(){
        return puntajeJugadorManual;
    }
    private String ganadorSet(){
        String ganador="Usuario";
        if(puntajeJugadorInteligenteSet==puntajeJugadorSet){
            
        }
        if(puntajeJugadorInteligenteSet>puntajeJugadorSet){
            ganador="Computadora";
        }
        return ganador;
    }
}
