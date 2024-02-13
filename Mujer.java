
/**
 * Abstraccion de una Mujer al cual se le solicita diferentes datos personales para su posterior publicacion
 * y manejo con los metodos definidos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Mujer
{
        //Definicion de atributos;-------------------------------------------

    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    //Getters y Setters-----------------------------------------------------------------
    
    
    /**
     * @return: Deuvele el nombre de la mujer
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @param: p_nombre: Nombre de la mujer
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * @return: Devuelve le apellido de la mujer
     */
    public String getApellido(){
        return this.apellido;
    }

    
    /**
     * @param: p_apellido: Apellido de la mujer
       */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * @return: Devuelve la edad e la mujer
     */
    public int getEdad(){
        return this.edad;
    }

    
    /**
     * @param: p_edad: Edad de la mujer
       */
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }

    /**
     * @return: Devuelve el estado civil de la mujer
     */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }

    
    /**
     * @param: p_estadoCivil: Estado civil de la mujer
       */
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }

    /**
     * @return: Devuelve el objeto de tipo Hombre de la mujer ne el caso de ser casada
     */
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    
    /**
     * @param: p_esposo: Esposo de la mujer, isntancia de la clase Hombre
       */
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }

    
    /**
     * Constructor de la clase Mujer.
     * 
     * @param: p_edad: Edad de la persona
     * @param: p_nombre: Nombre de la persona.
     * @param: p_apellido: Apellido de la misma.
     *
     * 
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    
    /**
     * Constructor de la clase Mujer.
     * 
     * @param: p_edad: Edad de la persona
     * @param: p_nombre: Nombre de la persona.
     * @param: p_apellido: Apellido de la misma.
     * @param: p_esposo: dato de tipo Hombre con respecto a su esposo, si tiene.
     *
     * 
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(p_esposo);
    }
    
    /**
     * Realiza el acto de pasar como paramtro al objeto de tipo hombre y cambia el atributo
     * de estadoCivil de la mujer por "casada"
     * 
     * @param: `_hombre: Hopmbre con quien la mujer se casa
     */
    public void CasarseCon(Hombre p_hombre){
        this.setEsposo(p_hombre);
        this.setEstadoCivil("casada");
    }
    
    /**
     * Modifica el estado civil de la mujer al de "divorciada", si es que
     * se encontraba casada
     */
    public void Divorcio(){
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
    }
    
    /**
     * Imprime datos perosnales de la mujer y los devuelve de tipo String
     */
    public String Datos(){
        return this.getNombre()+", "+this.getApellido()+" de "+this.getEdad()+" años de edad";
    }
    
    /**
     * Imprime los datos perosnales de la Mujer
     */
    public void MostrarEstadoCivil(){
        System.out.println(this.Datos()+" -"+this.getEstadoCivil());
    }
    
    /**
     * Imprime los datos de la persona con quien esta casada, si lo está
     */
    public void CasadaCon(){
        if(this.getEstadoCivil()=="casada"){
        System.out.println(this.Datos()+" esta casado con "+this.getEsposo().getNombre()
        +" de "+this.getEsposo().getEdad()+" años");
    }else{
        System.out.println("No esta casada");
    }
    }

}