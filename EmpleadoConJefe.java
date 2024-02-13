
import java.util.*;

 /**
 * Abstraccion de un empleado al cual se le solicita diferentes datos 
 * personales para su posterior publicacion y manejo.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class EmpleadoConJefe {
   //Definicion de los atributos de la clase Empleado------------------------
   
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
 
    
    /**
     * Constructor de la clase EmpleadoConJefe.
     * 
     * @param: p_cuil: Numero de cuil del empelado de hasta 11 digitos.
     * @param: p_nombre: Nombre del empleado.
     * @param: p_apellido: Apellido del empleado.
     * @param: p_importe; Sueldo basico del empleado.
     * @param: p_fecha: Anio de ingreso del empleado.
     * @param: p_jefe: persona de clase EmpleadoConJefe, en el caso de que le mismo no sea GERENTE GRAL
     * 
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre
    , double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
       
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
       
        
    }
    
    /**
     * Segundo Constructor de la clase EmpleadoConJefe.
     * 
     * @param: p_cuil: Numero de cuil del empelado de hasta 11 digitos.
     * @param: p_nombre: Nombre del empleado.
     * @param: p_apellido: Apellido del empleado.
     * @param: p_importe; Sueldo basico del empleado.
     * @param: p_fecha: Anio de ingreso del empleado.
     * 
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre
    , double p_importe, Calendar p_fecha){
       
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
        
    }
   
    //Definimos los setters de cada atributo---------------------------------
    
    /**
     * @param: p_cuil: Numero de cuil del empleado, de hasta 11 digitos.
     */
    private void setCuil(long p_cuil){
        this.cuil=p_cuil;
      }
    
      /**
       * @param: p_nombre: Nombre del empleado.
       */
    private void setNombre(String p_nombre){
        this.nombre=(p_nombre);
    }
    
    /**
     * @param: p_apellido: Apellido del empleado.
     */
    private void setApellido(String p_apellido){
        this.apellido=p_apellido;
    }
    
    /**
     * @param: p_importe; Sueldo basico del empleado.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico=p_sueldoBasico;
    }
    
    /**
     * @param: p_anio: Anio de ingreso del empleado.
     */
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso=p_fecha;
    }
    
    /**
     * @param:p_jefe: dato de tipo EmpleadoConJefe en el caso de que le mismo no sea GERENTE GRAL
     */
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe=p_jefe;
    }
    
    //Ahora definimos los Getters de cada atributo:----------------
    
    /**
     * @return: Devuelve el numero de cuil del empleado.
     */
    public long getCuil(){
        return this.cuil;
      }
    
      /**
       * @return: Devuelve el nombre dle empleado.
       */
    public String getNombre(){
        return this.nombre;
     }
    
     /**
      * @return: Devuelve el apellido del empleado.
      */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Devuelve el sueldo basico dle empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * @return: Devuelve el anio de ingreso del empleado.
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    /**
     * @return: Jefe de la persona, en el caso de que tenga
     */
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    
    /**
     * Calcula la antiguedad del empleado, obtenido como resultado de la resta
     * dle anio actual con el de ingreso del mismo.
     * 
     * @return: antiguedad del empleado en la empresa.
     */
    public int Antiguedad(){
       
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
       
        int antiguedad = anioHoy - fechaIngreso.get(Calendar.YEAR);
        return antiguedad;
    }
   //----------------------------------------------------------------
   
   /**
    * Calcula el valor del sueldo basico, menos las deducciones por obra 
    * social y seguro de vida.
    * 
    * @return: Devuelve el nuevo sueldo basico menos las deducciones mencionadas.
    */
    private double Descuento(){
        double seguroVida=1500;
        double obraSocial=(sueldoBasico* 0.02);
        sueldoBasico=(sueldoBasico-obraSocial)-seguroVida;
        return sueldoBasico;
    }
   
    /**
     * Modifica el sueldo del empleado con respecto a los adicionales, 
     * en concepto de antiguedad.
     * 
     * @return: Nuevo valor del sueldo basico con los adicionales.
     */
    private double Adicional (){
       
        
        double sueldoConAdicional = sueldoBasico; 
        if (this.Antiguedad() < 2) {
        sueldoConAdicional =sueldoConAdicional+ (sueldoBasico * 0.02); 
            } else if (this.Antiguedad() >= 2 && Antiguedad() < 10) {
        sueldoConAdicional =sueldoConAdicional+ (sueldoBasico * 0.04); 
            } else if (this.Antiguedad() >= 10) {
        sueldoConAdicional =sueldoConAdicional+ (sueldoBasico * 0.06); 
        }
        
        return sueldoConAdicional;

    }
   
    /**
     * Calcula el sueldo neto, correpsondiente al sueldo basico mas el 
     * adicional menos los descuentos.
     * 
     * @return: Devbuelve nuevo valor del sueldo.
     */
    public double SueldoNeto(){
        double sueldoNeto=(sueldoBasico+this.Adicional()) - this.Descuento();
        return sueldoNeto;
    }
    
    /**
     * Une la cadena de caracteres del nombre y apellido del empleado.
     * @return: Devuevle la cadena de caracteres unida.
     */
    public String NomyApe(){
        return this.getNombre()+", "+this.getApellido();
    }
    
    /**
     * Une la cadena de caracteres del nombre y apellido del empleado.
     * @return: Devuevle la cadena de caracteres unida.
     */
    public String ApeyNom(){
        
        return this.getApellido()+", "+this.getNombre();
    }
    
    /**
     * Imprime los datos personales del empleado, tales como nombre completo,
     * cuil, antiguedad y sueldo neto.
     */
    public void MostrarPantalla(){
        System.out.println("\nNombre y apellido: "+this.NomyApe());
        System.out.println("\nCUIL: "+this.getCuil());
        System.out.println("\nAntiguedad: "+this.Antiguedad()+" años de servicio.");
        System.out.println("\nSueldo neto: $" + this.SueldoNeto());
        
        if(this.getJefe()!=null){
            System.out.println("\nResponde a: "+this.getJefe().ApeyNom());
        }else{
            System.out.println("\nGERENTE GENERAL");
        }
        }
    
    /**
    * Impime los datos personales del empleado en una sola linea.
    * 
    * @return: Datos del empelado en una sola linea.
     */
    public String MostrarLinea(){
            
            return this.getCuil()+"      "+this.ApeyNom()+"..................$"
            +this.SueldoNeto();
        }
        
        /**
         * @return: devuelve un valor de tipo boolean con respecto a si la fecha actual
         * cocincide en mes y dia con la fecha en la cual el empleado
         * entro a trbajar en la empresa
         */
        public boolean EsAniversario(){
            Calendar hoy=new GregorianCalendar();
             return hoy.get(Calendar.MONTH)
             ==this.getFechaIngreso().get(Calendar.MONTH)&&
            hoy.get(Calendar.DAY_OF_MONTH)
            ==this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
            
        }
}

