import java.util.Random;
import java.util.Scanner;

/**
 * Se encarga de instanciar objetos de clase Circulo para posteiormente
 * actuar sobre las instanciar creadas segun el menu disponible
 * 
 */
public class CrearFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random unNumero = new Random();
        //Instanciacion del primer circulo con los datos provistos
        System.out.println("\nIngrese los datos del PRIMER círculo:");
        
        double radio1 = unNumero.nextDouble() * 100.0;
        
        System.out.print("Ingrese Coordenada X del centro: ");
        double x1 = teclado.nextDouble();
        teclado.nextLine(); 
        System.out.print("Ingrese Coordenada Y del centro: ");
        double y1 = teclado.nextDouble();
        teclado.nextLine(); 
        Punto punto1 = new Punto(x1, y1);
        Circulo circulo1 = new Circulo(radio1, punto1);

        System.out.println("\nIngrese los datos del SEGUNDO círculo:");
        
        
        //Instanciacion del segundo circulo con los datos provistos----------

        double radio2 = unNumero.nextDouble() * 100.0;
        
        System.out.print("Ingrese Coordenada X del centro: ");
        double x2 = teclado.nextDouble();
        teclado.nextLine(); 
        System.out.print("Ingrese Coordenada Y del centro: ");
        double y2 = teclado.nextDouble();
        teclado.nextLine();
        Punto punto2 = new Punto(x2, y2);
        Circulo circulo2 = new Circulo(radio2, punto2);

        
        
            int opcion1=0;

            
        do {
            //Menu disponible para actuar sobre ambos objetos---------------
            
            System.out.println("\nINGRESE UNA OPCION");             
             System.out.println("1. Calcular distancia entre círculos");
             System.out.println("2. Mostrar círculo mayor");
             System.out.println("3. Mostrar datos del PRIMER circulo");
             System.out.println("4. Mostrar datos del SEGUNDO circulo");
             System.out.println("5. Desplazar primer figura");
             System.out.println("6. Desplazar segunda figura");
             System.out.println("7. Salir");
             
              opcion1=teclado.nextInt();
             
             switch (opcion1) {
                 
                 case 1:
                     
                    double distancia = circulo1.DistanciaA(circulo2);
                    System.out.println("\nLa distancia entre los círculos es: " + distancia);
                    break;
                    
                    case 2:
                        System.out.println("\nEl circulo mayor es:");
                    Circulo mayor = circulo1.ElMayor(circulo2);
                    mayor.Caracteristicas();
                    break;
                    
                    case 3:
                        circulo1.Caracteristicas();
                        break;
                    
                    
                    case 4:
                        circulo2.Caracteristicas();
                        break;
                    
                    
                    case 5:
                        System.out.print("\nIngrese nueva Coordenada X del centro: ");
                    double xNueva = teclado.nextDouble();
                    teclado.nextLine(); 
                    System.out.print("\nIngrese nueva Coordenada Y del centro: ");
                    double yNueva = teclado.nextDouble();
                    teclado.nextLine(); 
                    
                    circulo1.Desplazar(xNueva, yNueva);
                    
                    break;
                        
                    case 6:
                        System.out.print("\nIngrese nueva Coordenada X del centro: ");
                    double xNueva1 = teclado.nextDouble();
                    teclado.nextLine(); 
                    System.out.print("\nIngrese nueva Coordenada Y del centro: ");
                    double yNueva2 = teclado.nextDouble();
                    teclado.nextLine(); 
                    
                    circulo2.Desplazar(xNueva1, yNueva2);
                        

                    case 7:
                    
                    System.out.println("\n*****GRACIAS POR USAR EL SERVICIO*****");
                    break;
            }

       
    } while (opcion1 != 7);
}
}
