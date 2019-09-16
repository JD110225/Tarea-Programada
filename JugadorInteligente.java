
public class JugadorInteligente
{
   private int puntaje;
   private int tirosRealizados;
   private double coordenadaX;
   private double coordenadaY;
   public String estrategia1(){
       String parOrdenado="";
       if(tirosRealizados<2){
           parOrdenado+="1,1";
        }
        return parOrdenado;
    }
}
