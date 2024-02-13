import java.util.*;

/**
 * Se encarga de instanciar objetos de tipo Cuenta Bncaria y Perosna
 * para depsues realizar un manejo de la informacion e imprimir datos sobre la misma
 */
public class EjecutadorBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
        
        System.out.println("\nIngrese los datos de la Persona:");
        System.out.print("Número de documento: ");
        int numeroDocumento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        
        
        fecha.set(1992, 1, 29);
        //Instanciacion de Persona------------------------------
        
        Persona persona = new Persona(numeroDocumento, nombre, apellido, fecha);
        
        System.out.print("\nIngrese el saldo inicial de la cuenta bancaria: ");
        double saldoInicial = scanner.nextDouble();
        
        //Instanciacion de una cuenta bancaria------------------
        
        CuentaBancaria cuenta = new CuentaBancaria(1249, persona, saldoInicial);
        System.out.print("\n---------------------------------------------");
        
        //Impresion de los datos de ambos-----------
        
        String mostrar1=cuenta.ToString();
        
        System.out.println("\n"+mostrar1);
        
        System.out.print("\n---------------------------------------------");
    }
}
