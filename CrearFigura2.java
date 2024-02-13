import java.util.Random;

/**
 * Realiza las correpsondientes acciones sobre vairos rectangulos, luego de ser provistos de la informacion
 * necesaria para su instanciacion.
     */
public class CrearFigura2
{
    
    public static void main (String [] args){
        //crear un rectángulo situado en el punto (0, 0) y cuyas dimensiones sean generadas a partir de números aleatorios

        Random unNumero = new Random ();
        double alto1 = unNumero.nextDouble()*100.0;
        double ancho1 = unNumero.nextDouble()*100.0;
        
        Punto punto1 = new Punto (0,0);
        Rectangulo rectangulo1 = new Rectangulo (punto1, ancho1, alto1);
        
        //desplazar el rectangulo a otro punto situado 40 unidades hacia la derecha y 20 hacia abajo
        rectangulo1.Desplazar(40, -20);
        
        //mostrar las características del rectangulo creado
        rectangulo1.Caracteristicas();
        System.out.println("\n--------------------------------------------------");

        //crear otro rectangulo centrado en el punto (7.4, 4.5) y cuyas dimensiones sean nuevos numeros aleatorios
        double alto2 = unNumero.nextDouble()*100.0;
        double ancho2 = unNumero.nextDouble()*100.0;
        Punto punto2 = new Punto (7.4,4.5);
        Rectangulo rectangulo2 = new Rectangulo (punto2, ancho2, alto2);
        //mostrar las características del círculo creado
        rectangulo2.Caracteristicas();
        
        //mostrar las características del mayor de los dos círculos
        System.out.println("\n--------------------------------------------------");

        System.out.println("\nEl rectangulo mayor es: ");

        rectangulo1.ElMayor(rectangulo2).Caracteristicas();
        
        //mostrar la distancia entre los dos círculo
        System.out.println ("La distancia entre restangulos es de: " +rectangulo1.DistanciaA(rectangulo2));
    }
    
    
}
