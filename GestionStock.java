
import java.util.Scanner;

public class GestionStock {
     /**
     *  Crea instancias de las clases Laboratorio y Producto, para luego ser
     *  manejados mediante le menu utilizando los metodos pre definidos
     *  en dichas clases.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicita los datos necesarios para isntanciar posteriormente un objeto
        //de la clase Laboratorio--------------------------------
        
        System.out.println("Ingrese los datos del Laboratorio:");
        System.out.print("Nombre: ");
        String nombreLaboratorio = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionLaboratorio = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoLaboratorio = scanner.nextLine();
        Laboratorio lab1 = new Laboratorio(nombreLaboratorio, direccionLaboratorio, telefonoLaboratorio);

        //-------------------------------------------------------------------------------------------------------------
        
        //Solicita datos para instanciar despues un objeto de clase Producto-----
        
        System.out.println("\nIngrese los datos del Producto:");
        System.out.print("Código: ");
        int codigoProducto = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Rubro: ");
        String rubroProducto = scanner.nextLine();
        System.out.print("Descripcion: ");
        String descripcionProducto = scanner.nextLine();
        System.out.print("Costo: ");
        double costoProducto = scanner.nextDouble();
        System.out.print("Stock: ");
        int stockProducto = scanner.nextInt();
        System.out.print("Punto Reposicion: ");
        int porcPtoRepo1 = scanner.nextInt();
        System.out.print("Existenca Minima: ");
        int existMinima1 = scanner.nextInt();

        // Crear instancia de Producto
        Producto producto1 = new Producto(codigoProducto, rubroProducto, descripcionProducto, costoProducto, stockProducto, porcPtoRepo1, existMinima1, lab1);

        //Muestra los datos del producto
        producto1.Mostrar();
        
        int opcion;
        do {
            //Menu de opciones para realizar-----------------------------
            
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Ajustar Stock");
            System.out.println("2. Mostrar informacion");
            System.out.println("3. Mostrar Precio de lista y contado");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            
             switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad para ajustar el stock: ");
                    int cantidad = scanner.nextInt();
                    producto1.Ajuste(cantidad);
                    break;
                    
                    case 2:
                         producto1.Mostrar();

                         break;
                         
                     case 3:
                            String muestraLinea = producto1.MostrarLinea();
                             System.out.println("----------------------------------------------------");
                            System.out.println(muestraLinea);
                             System.out.println("----------------------------------------------------");
                            break;
                    
                    case 4:
                    System.out.println("GRACOAS POR USAR EL SERVICIO");
                    break;
                default:
                    System.out.println("ERROR. Opción invalida");
            }

        } while (opcion != 4);
    }
}

