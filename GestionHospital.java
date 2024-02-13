import java.util.Scanner;

/**
 * Esta clasese encarga de gestionar los datos de pacientes y hospitales para psoteiromente
 * poder imprimir los datos filiatorios de la persona
 */
public class GestionHospital
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        //Instancia de la clase Hospital con datos pre definidos-----------------------------------------------
        Hospital hospital1=new Hospital("Garrahan", "Leonardo Ruiz");
        
        System.out.println("Desea ingresar un nuevo Paciente? (1=si/2=no)" );
        int respuesta = teclado.nextInt();
        teclado.nextLine();
        
        switch(respuesta){
            
            case 1: 
                System.out.println("\nIngrese nombre completo");
                String nombre1=teclado.nextLine();
                
                System.out.println("\nIngrese domicilio");
                String domicilio1=teclado.nextLine();
                
                System.out.println("\nIngrese numero de historia clinica");
                int historia1=teclado.nextInt();
                teclado.nextLine();
                                
                System.out.println("\nIngrese nombre de localidad de nacimiento");
                String localdiadNac1=teclado.nextLine();
                
                System.out.println("\nIngrese nombre de provincia de nacimiento");
                String provNac1=teclado.nextLine();
                
                System.out.println("\nIngrese nombre de localidad del domicilio");
                String localdiadDom1=teclado.nextLine();
                
                System.out.println("\nIngrese nombre de provincia actual");
                String provDom1=teclado.nextLine();
                
                
                Localidad localidadNacimiento1=new Localidad(localdiadNac1, provNac1);
                
                Localidad localidadVive1=new Localidad (localdiadDom1,provDom1);
                
                
                //Instancia de la clace Paciente con los datos provistos------------------------------
                Paciente paciente1=new Paciente(historia1,nombre1,domicilio1,
                localidadNacimiento1,localidadVive1);
                
                
                hospital1.ConsultaDatosFiliatorios(paciente1);
                
                
                break;
                
                case 2:
                    System.out.println("\nGRACIAS POR USAR EL SERVICIO");
                   
                    break;
                    
                    case 3:
                        System.out.println("\nERROR - INGRESE VALOR CORRECTO");
                        
                     break;
        }
        
        
        
        
    }
}
