import java.util.Scanner;
/**
 * Se encarga instanciar y posteriormente publicar la informacion pasada
 * como parametro a un ojbeto de clase Punto.
 * 
 * @author: Yago Alberto Ayala.
 * @version: 1.0.
 */


public class EjecutaPunto
{
   public static void main (String [] args){
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("\nIngrese valor de X del PRIMER punto: ");
       double x = teclado.nextDouble();
       
        System.out.println("\nIngrese valor de Y del PRIMER punto: ");
        double y = teclado.nextDouble();
        
       Punto punto1 = new Punto (x, y);
       punto1.Mostrar();
        //------------------------------------------------------------------------------------------------
       System.out.println("\nIngrese valor de X del SEGUNDO punto: ");
       double x2 = teclado.nextDouble();
       
        System.out.println("\nIngrese valor de Y del SEGUNDO punto: ");
        double y2 = teclado.nextDouble();
        
       Punto punto2 = new Punto (x2, y2);
        
       punto2.Mostrar();
       //------------------------------------------------------------------------------------------------------
       System.out.println("\n----------------------------------------------------------");
       
        double distancia = punto1.DistanciaA(punto2);

       System.out.println("\nDistancia de entre los puntos es de: " + distancia);
       
    
   }
}
