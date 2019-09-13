import java.lang.Math;
public class Verificador
{
   public boolean esInterior(double puntoX,double puntoY,double radioCirculo){
     boolean interior=false;
       if(Math.pow(puntoX-1,2)+Math.pow(puntoY-1,2)<Math.pow(radioCirculo,2)){
           interior=true;
       }
     return interior;
}
    public void circuloAcertado(double puntoX,double puntoY){
        if(esInterior(puntoX,puntoY,0.05)){
            System.out.println("Circulo menor");
        }
        else{
            if(esInterior(puntoX,puntoY,0.4)){
                System.out.println("Circulo medio");
            }
            else{
                if(esInterior(puntoX,puntoY,1)){
                    System.out.println("Circulo grande");
                }
                else{
                    System.out.println("No hubo acierto");
                }
    }
}
}
}
