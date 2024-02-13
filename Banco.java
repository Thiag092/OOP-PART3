import java.util.Scanner;
import java.util.*;

/**
*Clase ejcutable encargada de instanciar objetos de clase Persona, Cuenta corriente y CajaDeShorro
*para posteiormente ejecutar el menu y realizar lasacciones  deseasdas de acuerdo a los metodos definidos anteiromente
 */
public class Banco
{
    public static void main (String [] args){
        Scanner teclado=new Scanner(System.in);
        
        
                System.out.println("Ingrese numero de la caja de ahorro");
                int numero1=teclado.nextInt();
             teclado.nextLine();
                
                System.out.println("Ingrese numero de DNI del cliente");
                 int dni1=teclado.nextInt();
                 teclado.nextLine();
                 
                 System.out.println("Ingrese nombre del cliente");
                 String nombre1=teclado.nextLine();
                 
                 System.out.println("Ingrese apellido del cliente");
                 String apellido1=teclado.nextLine();
                 
                 
                 System.out.println("Ingrese fecha de nacimiento del cliente");
                 System.out.println("Ano");
                 int ano1=teclado.nextInt();
                 teclado.nextLine();
                 
                 System.out.println("Mes");
                 int mes1=teclado.nextInt();
                 teclado.nextLine();
                 
                 System.out.println("Dia");
                 int dia1=teclado.nextInt();
                 teclado.nextLine();
                 
                 
                 Calendar fecha=new GregorianCalendar();
                  fecha.set(ano1, mes1-1, dia1);
                 
                 Persona cliente1=new Persona(numero1, nombre1, apellido1, fecha);
                
                CajaDeAhorro cajaAhorro1=new CajaDeAhorro(numero1, cliente1);
                 CuentaCorriente cuentaCorriente1=new CuentaCorriente(numero1, cliente1);
            
                 
                 
                 if(cliente1.EsCumpleanos()){
           System.out.println("*******************************************************************");
            System.out.println("                LE DESEAMOS UN FELIZ CUMPLEANOS");
           System.out.println("*******************************************************************");
        }
                 
                 
                
        
        boolean salir=false;
            
        while(salir==false){
            
            System.out.println("\nQue accion desea realizar?");
             System.out.println("------------------------------------------------");
            System.out.println("\nCaja de Ahorro:1-Extraccion//2-Desposito");
            System.out.println("------------------------------------------------");
            System.out.println("\nCuenta Corriente:3-Extraccion//4-Desposito");
            System.out.println("------------------------------------------------");
            System.out.println("\n5-Salir");
            int respuesta2=teclado.nextInt();
            teclado.nextLine();
            
            switch(respuesta2){
                case 1:
                    System.out.println("Ingrese monto a extraer");
                    double extraccion1=teclado.nextInt();
                    
                    
                    if(extraccion1<=cajaAhorro1.getSaldo()){
                    
                    
                        cajaAhorro1.Extraer(extraccion1);
                        System.out.println("\nSaldo restante: "+cajaAhorro1.getSaldo());
                    }else{
                        System.out.println("\nNo puede extraer mas que el saldo!");
                    }
                    
                    if(cajaAhorro1.PuedeExtraer(extraccion1)==false){
                       System.out.println("\n No tiene habilitadas mas extracciones!");
                    }
                    
                    break;
                    case 2:
                        System.out.println("Ingrese monto a depositar");
                    double deposito1=teclado.nextInt();
                    
                    cajaAhorro1.Depositar(deposito1);
                    System.out.println("Saldo restante: "+cajaAhorro1.getSaldo());
                    break;
                    
                    case 3:
                        System.out.println("Ingrese monto a extraer");
                    double extraccion2=teclado.nextInt();
                    
                    cuentaCorriente1.Extraer(extraccion2);
                    System.out.println("Saldo restante: "+cuentaCorriente1.getSaldo());
                    break;
                    
                    case 4:
                        System.out.println("Ingrese monto a depositar");
                    double deposito2=teclado.nextInt();
                    
                    cuentaCorriente1.Depositar(deposito2);
                    System.out.println("Saldo restante: "+cuentaCorriente1.getSaldo());
                    break;
                    
                
                    case 5:
                        System.out.println("\nGracias por usar el servicio");
                        return;
                    
                    
                    
            }
            
        }
        
        
        
    }
}
