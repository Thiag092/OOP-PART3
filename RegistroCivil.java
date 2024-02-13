import java.util.Scanner;

/**
 * Esta clase se encarga de instanciar objetos de calses Hombre y Mujer, los cuale sposteriormente 
 *realiza diversas acciones como casarlos, divorciados,o imprimir
 *sus datos perosnales.
 */
public class RegistroCivil
{
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Datos del hombre:");
        System.out.println("\nIngrese nombre:");
        String nombreH=teclado.nextLine();
        
        System.out.println("\nIngrese apellido:");
        String apellidoH=teclado.nextLine();
        
        System.out.println("\nIngrese edad:");
        int edadH=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Estado civil: ");
        String estadoH=teclado.nextLine();
        
        //Instancia de clase Hombre------------------------------
        Hombre esposo1=new Hombre(nombreH, apellidoH, edadH);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Datos de la mujer:");
        System.out.println("\nIngrese nombre:");
        String nombreM=teclado.nextLine();
        
        System.out.println("\nIngrese apellido:");
        String apellidoM=teclado.nextLine();
        
        System.out.println("\nIngrese edad:");
        int edadM=teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Estado civil: ");
        String estadoM=teclado.nextLine();
        
        //Instancai de calse Mujer-----------------------------------------------------
        Mujer esposa1=new Mujer(nombreM, apellidoM, edadM);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Estan casados entre ellos? (Si/No)");
        String respuesta=teclado.nextLine();
        if(respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("SI"))
        {
            esposo1.CasarseCon(esposa1);
            esposa1.CasarseCon(esposo1);
            System.out.println("\n*****CERTIFICADO DE MATRIMONIO*****");
            esposo1.CasadoCon();
            System.out.println("\n----------------------------------------------------");
            esposa1.CasadaCon();
        }else{
            System.out.println("**INFORMACION DE LAS PERSONAS**");
            esposo1.Datos();
            esposo1.MostrarEstadoCivil();
            
            System.out.println("\n----------------------------------------------------");

            esposa1.Datos();
            esposa1.MostrarEstadoCivil();
            
            System.out.println("\n***************************************");
            System.out.println("\nGRACIAS POR USAR EL SERVICIO");
            System.out.println("\n***************************************");

            return;
        }
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("\nDesea inscribir el divorcio?(Si/No)");
        String respuesta2=teclado.nextLine();
        
        if(respuesta2.equalsIgnoreCase("si")||respuesta2.equalsIgnoreCase("SI")){
            esposo1.Divorcio();
            esposa1.Divorcio();
            
            esposo1.MostrarEstadoCivil();
            System.out.println("\n----------------------------------------------------");
            esposa1.MostrarEstadoCivil();
            System.out.println("\n----------------------------------------------------");
            

            System.out.println("\n*****DIVORCIO ANOTADO*****");
            
            System.out.println("\n----------------------------------------------------");

        }else{
            System.out.println("***************************************");
            System.out.println("GRACIAS POR USAR EL SERVICIO");
            System.out.println("***************************************");
        }
    }
    
    
}
