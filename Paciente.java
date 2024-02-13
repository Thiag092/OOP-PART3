
/**
 * Abstraccion de un Paciente al cual se le solicita diferentes datos personales para su posterior publicacion
 * Ymanejo junto ocn los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Paciente
{
        //Definicion de atributos;-------------------------------------------

    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    //Setterges y Getters------------------------------------------------------------
    
    /**
     * @return: Devuelve la lcoalidad de ancimiento del paciente
     */
    public Localidad getLocalidadNacido(){
        return this.localidadNacido;
    }
    
     /**
     * @param: p_localidadN: dato de tipo Localidad, correspondiente
     * al lugar de nacimiento del paciente
     */
    private void setLocalidadNacido(Localidad p_localidadN){
        this.localidadNacido=p_localidadN;
    }
    
    /**
     * @return: devuelve la localidad actual del paciente
     */
    public Localidad getLocalidadVive(){
        return this.localidadVive;
    }
    
    /**
     * @param:p_localidadVive: Dato de tip oLocalidad, del lugar
     * de nacimiento del paciente
     */
    private void setLocalidadVive(Localidad p_localidadVive){
        this.localidadVive=p_localidadVive;
    }
    
    /**
     * @return: devuevle el numero de hisotria clinica dle paciente
     */
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    /**
     * @param:p_historiaClinica: Numero de historia clinica del paciente
     */
    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }

    /**
     * @return: devbuelve le nombre del paciente
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @param:p_nombre: nombre dle paciente
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * @return: devuelve el domicilio dle paciente
     */
    public String getDomicilio(){
        return this.domicilio;
    }

    /**
     * @param:p_domicilio:domicilio del paciente
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }

    /**
     * Constructor de la clase Paciente.
     * 
     * @param: p_historia: Historia clinica del paciente
     * @param: p_nombre: Nombre de la persona.
     * @param: p_domicilio: domicilio del paciente
     * @param: p_localidadNacido; Localdiad donde nacio, de tipo Localidad
     * @param: p_localidadVive; Localidad donde viva actualmente, de tipo Localidad
     * 
     */
        public Paciente(int p_historia, String p_nombre, String p_domicilio,
        Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    /**
     * Imprime una cadena de datos personales del paciente
     */
    public void CadenaDeDatos(){
        System.out.println(this.getNombre()+"....."+this.getHistoriaClinica()+"....."
        +this.getDomicilio()+" - "+this.localidadVive.getNombre()+" "+
        this.getLocalidadVive().getProvincia());
    }
    
    /**
     * Imprime una cadena de datos personales del paciente
     * 
     */
    public void MostrarDatosPantalla(){
        System.out.println("Paciente: "+this.getNombre());
        System.out.println("Historia Clinica: "+this.getHistoriaClinica());
        System.out.println("Domicilio: "+this.getDomicilio());
        System.out.println("Localidad: "+this.getLocalidadVive().getNombre());
        System.out.println("Provincia: "+this.getLocalidadVive().getProvincia());
    }    
}

