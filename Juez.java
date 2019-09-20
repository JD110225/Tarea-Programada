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
        public int getPuntajeManual(){
            return puntajeJugadorManual;
        }
        public int getPuntajeInteligente(){
            return puntajeJugadorInteligente;
        }
        public String ganadorSet(){
            String ganador="Usuario";
            if(puntajeJugadorInteligenteSet==puntajeJugadorSet){      
            }
            if(puntajeJugadorInteligenteSet>puntajeJugadorSet){
                ganador="Computadora";
            }
            return ganador;
        }
        public boolean esInterior(double puntoX,double puntoY,double radioCirculo){
         boolean interior=false;
           if(Math.pow(puntoX-1,2)+Math.pow(puntoY-1,2)<Math.pow(radioCirculo,2)){
               interior=true;
           }
         return interior;
    }
    //Falta parametro de jugador para ver a quién se le suman los puntos.
        public void circuloAcertado(double puntoX,double puntoY){
            if(esInterior(puntoX,puntoY,0.05)){
                puntajeJugadorSet+=100;
                puntajeJugadorManual+=100;
            }
            else{
                if(esInterior(puntoX,puntoY,0.4)){
                    puntajeJugadorSet+=20;
                    puntajeJugadorManual+=20;
                }
                else{
                if(esInterior(puntoX,puntoY,1)){
                   puntajeJugadorSet+=15;
                   puntajeJugadorManual+=15;
                }
                else{
                    System.out.println("No hubo acierto");
             }

    }

}

}
}
