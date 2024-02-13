
/**
 * Abstraccion de una escuela al cual se le solicita diferentes datos 
 * para su posterior publicacion.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Escuela {
        //Definicion de atributos;-------------------------------------------

    private String nombre;
    private String domicilio;
    private String director;
    
    
    /**
     * Constructor de la clase Persona.
     * 
     * @param: p_nombre: Nombre dle establecimiento
     * @param: p_domicilio: Domicilio del establecimiento
     * @param: p_director: Director a cargo de la institucion  
     */
    public Escuela (String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    /**
     * Imprime los datos del recibo solicitados tanto de la Escuela comno del docente
     */
    public void ImprimirRecibo(Docente p_docente){
        System.out.println("Escuela: "+this.getNombre()+"    Domicilio: "+this.getDomicilio()+
        "     Director: "+this.getDirector());
        
        System.out.println("-------------------------------------------------------------------------------------");
        
        System.out.println("Docente: "+p_docente.getNombre());
        System.out.println("Sueldo: ................."+p_docente.CalcularSueldo());
        System.out.println("Sueldo basico: .........."+p_docente.getSueldoBasico());
        System.out.println("Asignacion familiar......."+p_docente.getAsignacionFamiliar());
    }
    
    //Getteres y Setteres----------------------------------------------------------------------------------
    
    /**
     * @return: Devuelve le nombre de la institucion
     */
    public String getNombre(){
        return this.nombre;
    }//end method getNombre
    
    /**
     * @param: p_nombre: Nombre dle establecimiento
     */
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * @return: Devuelve el domicilio de la institucion
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * @param: p_domicilio: Domicilio del establecimiento
     */
    public void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }//end method setDomicilio
    
    /**
     * @return: Devuelve el nombre dle director a cargo de la institucion
     */
    public String getDirector(){
        return this.director;
    }//end method getDirecotr
    
    /**
     * @param: p_director: Director a cargo de la institucion 
     */
    public void setDirector(String p_director){
        this.director = p_director;
    }//end method setDirecotr


    }


    
    
   