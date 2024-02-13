import java.util.Scanner;

/**
 * Se encarga de imprimir le recibo de sueldo del docente junto con la iunformacion perosnal del mismo
 */
public class Secretaria
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        
        
        
        
        boolean salir=false;
        
        while(salir==false){
            System.out.println("\n-----------------------------------------------");
            System.out.println("\nDesea imprimrir un recibo? (1-Si//2-No)");
            System.out.println("\n-----------------------------------------------");
            int respuesta=teclado.nextInt();
            teclado.nextLine();
            
            switch(respuesta){
                case 1:
                    System.out.println("Ingrese nombre completo del docente");
                String nombre=teclado.nextLine();
             
                System.out.println("\nIngrese grado del docente");
                String grado1=teclado.nextLine();

                         
                 System.out.println("\nIngrese sueldo Basico del docente");
                 double sueldo1=teclado.nextInt();
                         teclado.nextLine();

                System.out.println("\nIngrese monto de asignacion familiar del docente");
                double asignacion1=teclado.nextInt();
                            teclado.nextLine();

            
                Docente docente1=new Docente(nombre, grado1, sueldo1, asignacion1);
                
                System.out.println("\nIngrese nombre del establecimiento");
            String nombreEscuela1=teclado.nextLine();
            
            System.out.println("\nIngrese domicilio del establecimiento");
            String domicilio1=teclado.nextLine();
            
            System.out.println("\nIngrese nombre completo del director");
                String nombreDirector=teclado.nextLine();
            
            Escuela escuela1=new Escuela(nombreEscuela1, domicilio1, nombreDirector);
            
             escuela1.ImprimirRecibo(docente1);
             break;
             
            
             
                case 2:
                     System.out.println("\n************************************");
                    System.out.println("\nGRACIAS POR USAR EL SERVICIO");
                    System.out.println("\n************************************");
                    salir=true;
                    break;
                    
                    default:
                    System.out.println("\nOpción no válida");
                    
            }
            
        }
        
        
        
    }
}
