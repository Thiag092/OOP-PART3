import java.util.Scanner;
import java.util.*;

/**
 * Esta clase se encarga de instanciar objetos de tipo EmpleadoConJefe
 * y verificar posteirometne si teien eprmsi ode retirarse temprano,si teiene jefe
 * o simeplemente imprimir la informacion del mismo.
 */
public class EjecutaEmpleadoConJefe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        EmpleadoConJefe empleado1 = null;
        
        Calendar fechaJefe=new GregorianCalendar(1980,9,10);
        EmpleadoConJefe jefe1 = new EmpleadoConJefe (22334455,"Gregorio", "Bulgueri",200,fechaJefe);
        int opcion1;

        do {
            //Menu disponible para utilizar sobre le sujeto-------------------------------------
            System.out.println("\n1. Ingresar datos de un empleado");
            System.out.println("2. Mostrar datos del empleado");
            System.out.println("3. Verificar si es el aniversario del empleado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion1 = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion1) {
                case 1:
                    System.out.println("Ingrese el CUIL del empleado:");
                    long cuil1 = teclado.nextLong();
                    teclado.nextLine(); 

                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre1 = teclado.nextLine();

                    System.out.println("Ingrese el apellido del empleado:");
                    String apellido1 = teclado.nextLine();

                    System.out.println("Ingrese el sueldo del empleado:");
                    double sueldo1 = teclado.nextDouble();
                    teclado.nextLine(); 

                    System.out.println("\nFecha de ingreso::");
                    System.out.println("\nIngrese el DIA de ingreso del empleado:");
                    int diaIngreso1 = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese el MES de ingreso del empleado:");
                    int mesIngreso1 = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Ingrese el ANO de ingreso del empleado:");
                    int anioIngreso1 = teclado.nextInt();
                    teclado.nextLine();

                    
                    Calendar fechaIngreso1 = new GregorianCalendar(anioIngreso1, mesIngreso1 - 1, diaIngreso1);

                    
                    System.out.println("\nTiene cargo de Gerente General? (Sí/No):");
                    String tieneCargo1 = teclado.nextLine();

                    if(tieneCargo1.equalsIgnoreCase("si")||tieneCargo1.equalsIgnoreCase("Si")){
                    empleado1 = new EmpleadoConJefe(cuil1, apellido1, nombre1, sueldo1, fechaIngreso1);
                    }
                    else{empleado1 = new EmpleadoConJefe(cuil1, apellido1, nombre1, sueldo1, fechaIngreso1,jefe1);
                    }
                    

                    
                    break;
                case 2:
                       if (empleado1 != null) {
                        empleado1.MostrarPantalla();
                    } else {
                        System.out.println("\nPrimero debe ingresar los datos del empleado.");
                    }
                    break;
                case 3:
                    if (empleado1 != null && empleado1.EsAniversario()) {
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("\n***Es el aniversario del empleado ***");
                        System.out.println("\n      Puede retirarse temprano");
                        System.out.println("----------------------------------------------------------------");
                    } else {
                        System.out.println("\nNo es el aniversario del empleado.");
                    }
                    break;
                case 4:
                    System.out.println("GRACIAS POR USAR EL SERVICIO");
                    break;
                default:
                    System.out.println("ERRO. Valor incorrecto");
                    break;
            }
        } while (opcion1 != 4);

        
    }
}
