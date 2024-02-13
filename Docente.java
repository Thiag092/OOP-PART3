
/**
 * Abstraccion de un Docente al cual se le solicita diferentes
 * datos personales para su posterior publicacion y manejo de los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
    public class Docente {
            //Definicion de atributos;-------------------------------------------

    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    
    /**
     * Constructor de la clase Docente.
     * 
     * @param: p_nombre: Nombre del docente.
     * @param: p_grado: Grado a cargo
     * 
     * @param: p_sueldoBasico: Sueldo b asico del docente
     * @param: p_asignacion; Monto de asignacino por hijo
     * 
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacion){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacion);
    }
    
    /**
     * @return: Devuelve el valor del sueldo luego de calcular la suma con la asignacino familiar
     */
    public double CalcularSueldo(){
        double sueldo = this.getSueldoBasico()+this.getAsignacionFamiliar();
        return sueldo;
    
    }

    //Getteres y Setters---------------------------------------------------------------
    /**
     * @param: p_nombre: Nombre del docente.
     */
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * @param: p_grado: Grado a cargo.
     */
    public void setGrado(String p_grado){
        this.grado = p_grado;
    }

    /**
     * @param:p_sueldoBasico: Sueldo b asico del docente
     */
    public void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }

    /**
     * @param: p_asignacion; Monto de asignacino por hijo
     */
    public void setAsignacionFamiliar(double p_asignacionFamiliar){
        this.asignacionFamiliar = p_asignacionFamiliar;
    }

    
    /**
     * @return: nombre del docente
     */
    public String getNombre(){
        return this.nombre;
    }

    
    /**
     * @return:grado de enseñanza del docente
     */
    public String getGrado(){
        return this.grado;
    }

        
    /**
     * @return:sueldo basico del docente
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

        
    /**
     * @return: monto de asignacion familiar del docente
     */
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
}