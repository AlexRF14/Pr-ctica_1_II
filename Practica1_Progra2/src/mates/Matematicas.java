package src.mates;
import src.aplicacion.Principal; 
public class Matematicas {
   
    
    
    
    public static double generarNumeroPi(double pasos){
        double aciertos = 0;
        double areaCuadrado = 4;
        double puntosTotales = Principal.pasos;
        
        for(double i = 0; i < puntosTotales; i++){
            double x = (double)(Math.random()*-1 + 1);
            double y = (double)(Math.random()*-1 + 1);

            if (x*x + y*y <=1){
                aciertos = aciertos + 1;
        }

       
    }
        return (areaCuadrado * (aciertos / (double) pasos));

    }   
}