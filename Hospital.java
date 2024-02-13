

/**
 * Abstraccion de un Hospital al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo con los metodos definidos.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Hospital
{
        //Definicion de atributos;-------------------------------------------

    private String nombre;
    private String director;

    
    
    /**
     * @return: devuelve el nombre del director
     */
    public String getNombre(){
        return this.nombre;
    }

    
    /**
     * @param: p_nombre; nombre dle director
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    
    /**
     * @return: Devuelve le apellido del director
     */
    public String getDirector(){
        return this.director;
    }

    
    /**
     * @param: p_director; apellido dle director
     */
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    /**
     * Constructor de la clase Hospital.
     * 
     * @param: p_nombre: Nombre del director
     * @param: p_director: Apellido del director.
     * 
     */
    public Hospital(String p_nombre, String p_director){
        this.setNombre(p_nombre);
        this.setDirector(p_director);
    }

    /**
     * Este metodo se encarga de imprimir los datos filiatorios de un determinado apciente
     * Imprimiendo ademas los datos del hospital
     */
    public void ConsultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: "+this.getNombre());
        System.out.println("Director: "+this.getDirector());
    
         System.out.println("------------------------------------------------------");
        System.out.println("Paciente: "+p_paciente.getNombre());
          
         System.out.println("Historia Clinica: "+p_paciente.getHistoriaClinica());
           
         System.out.println("Domicilio: "+p_paciente.getDomicilio());
            
        p_paciente.getLocalidadVive().Mostrar();
    } 
    
    
}