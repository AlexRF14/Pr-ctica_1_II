package src.aplicacion;
import src.mates.Matematicas;
import java.util.Scanner;
public class Principal {
    public static long pasos;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero de puntos: ");
        pasos = sc.nextInt();
        sc.close();
        
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(pasos));
        }
}
