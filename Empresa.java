import java.util.*;
/**
 * Se encarga de instanciar un objeto de clase Empleado para posteiromente verificar que le mismo posee
 * permiso para retirarse temprano del trabajo
 * de acuerdo a si es su aniversario desde que entro a trabajar
 * dentro de la empresa
 */
public class Empresa
{
    public static void main (String [] args){
        Calendar hoy1=new GregorianCalendar();
        Calendar cumple1=new GregorianCalendar();
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del empleado:");
        System.out.print("Cuil de empleado: ");
        int cuil1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Sueldo basico: ");
        double sueldoBasico1 = scanner.nextDouble();
        scanner.nextLine(); 
        
        Empleado empleado1=new Empleado(cuil1,nombre1, apellido1,sueldoBasico1,cumple1);
        
        
        if (cumple1.get(Calendar.MONTH) == hoy1.get(Calendar.MONTH)
                && cumple1.get(Calendar.DAY_OF_MONTH) == hoy1.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("\n***FELIZ CUMPLEAÑOS "+empleado1.getNombre()+" ***");
            System.out.println("\nPUEDE RETIRARSE UNA HORA ANTES");
        } else {
            System.out.println("\nNO ES SU CUMPLEAÑOS HOY");
        }
        
    }
}
