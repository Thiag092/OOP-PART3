
/**
 * Abstraccion de una Hombre al cual se le solicita diferentes datos personales para su posterior publicacion
 * y manejo con los metodos definidos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Hombre
{
            //Definicion de atributos;-------------------------------------------

   private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

        //Getters y Setters-----------------------------------------------------------------

    
    /**
     * @return: Deuvele el nombre de del hombre
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * @param: p_nombre: Nombre del hombre
       */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * @return: Devuelve le apellido del hombre
     */
    public String getApellido(){
        return this.apellido;
    }

    
    /**
     * @param: p_apellido: Apellido del hombre
       */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * @return: Devuelve la edad del hombre
     */
    public int getEdad(){
        return this.edad;
    }

    
    /**
     * @param: p_edad: Edad del hombre
       */
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }

    /**
     * @return: Devuelve el estado civil del hombre
     */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }

    
    /**
     * @param: p_estadoCivil: Estado civil del hombre
       */
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }

    /**
     * @return: Devuelve el objeto de tipo Mujer ne el caso de ser casado
     */

    public Mujer getEsposa(){
        return this.esposa;
    }

    /**
     * @param: p_esposo: Esposa del hombre, isntancia de la clase Mujer
       */
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }


    
     /**
     * Constructor de la clase Hombre.
     * 
     * @param: p_edad: Edad de la persona
     * @param: p_nombre: Nombre de la persona.
     * @param: p_apellido: Apellido de la misma.
     *
     * 
     */
        public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    
    /**
     * Segundo Constructor de la clase Hombre.
     * 
     * @param: p_edad: Edad de la persona
     * @param: p_nombre: Nombre de la persona.
     * @param: p_apellido: Apellido de la misma.
     * @param: p_esposa: dato de tipo Mujer con respecto a su esposa, si tiene.
     *
     * 
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(p_esposa);
    }
    
    
    /**
     * Realiza el acto de pasar como paramtro al objeto de tipo mujer y cambia el atributo
     * de estadoCivil del hombre por "casado"
     * 
     * @param: p_mujer: Mujer con quien la mujer se casa
     */
    public void CasarseCon(Mujer p_mujer){
        this.setEsposa(p_mujer);
        this.setEstadoCivil("casado");
    }
    
    /**
     * Modifica el estado civil de del hombbre al de "divorciado", si es que
     * se encontraba casado
     */
    public void Divorcio(){
        this.setEsposa(null);
        this.setEstadoCivil("Divorciado");
    }
    
        /**
     * Imprime datos perosnales de del hombre y los devuelve de tipo String
     */
    public String Datos(){
        return this.getNombre()+", "+this.getApellido()+" de "+this.getEdad()+" años de edad";
    }
    
    /**
     * Imprime los datos perosnales deñ Hombre
     */
    public void MostrarEstadoCivil(){
        System.out.println(this.Datos()+" -"+this.getEstadoCivil());
    }
    
    
    /**
     * Imprime los datos de la persona con quien esta casado, si lo está
     */
    public void CasadoCon(){
        if(this.getEstadoCivil()=="casado"){
        System.out.println(this.Datos()+" esta casado con "+this.getEsposa().getNombre()
        +" de "+this.getEsposa().getEdad()+" años");
    }else{
        System.out.println("No esta casado");
    }
    }
    }
