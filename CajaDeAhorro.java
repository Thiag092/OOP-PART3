
/**
 * Abstraccion de una caja de ahorro al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo segun los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
    public class CajaDeAhorro {
            //Definicion de atributos;-------------------------------------------

   private int nroCuenta;
   private double saldo;
   private int extraccionesPosibles;
   private Persona titular;
   
        //Getteres y Setters-----------------------------------------------------------------
        /**
         * @return: Deuvele el numero de cuenta 
         */
    public int getNroCuenta(){
        return this.nroCuenta;
    }

     /**
         * @param: p_nroCuenta: Nro de la cuenta
         */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
     /**
         * @return: Deuvele el saldo de la cuenta
         */
    public double getSaldo(){
        return this.saldo;
    }
    
     /**
         * @param:p_saldo: saldo disponible de la caja de ahorro
         */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
     /**
         * @return: Deuvele el numero de extracciones posibles de cuenta 
         */
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }

     /**
         * @param: p_extraccionesPosibles:cantidad de extracciones de la caja
         */
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }

         /**
         * @return: Deuvele el titular de cuenta 
         */
    public Persona getTitular(){
        return this.titular;
    }

         /**
         * @param: p_titular: Titular de la caja
         */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
     * Constructor de la clase CajaDeAhorro.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_titular titular de la cuenta
     * 
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(0);
       this.setExtraccionesPosibles(0);
       this.setTitular(p_titular);
   }
   
   /**
     *Segundo  Constructor de la clase CajaDeAhorro.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_saldo: saldo disponbiel
     * @param: p_titular titular de la cuenta
     * 
     */
   public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(p_saldo);
       this.setExtraccionesPosibles(0);
       this.setTitular(new Persona(0,""," ",null));
   }
   
   /**
    * @return: Devuelve un mensaje booleano conforme pueda o no realizar als extracciones
    * siempre y cuando no supere lelimite pre establecido
    */
   public boolean PuedeExtraer(double p_importe){
       if ( extraccionesPosibles<=10 &&this.getSaldo()>=p_importe){
            this.extraccionesPosibles++;
           return true;
       }else{
           return false;
       }
       
       
   }
   
   /**
    * @param: p_importe: Modifica el saldo de la caja restando el saldo actual al tratarse de una extraccion
    * 
    */
   public void Extraccion(double p_importe){
       
           this.setSaldo(this.getSaldo()-p_importe);
   }
   
   
   /**
    * @param: p_importe:  Determina la autorizacion conforme
    * si es posible realizar la extraccion con respecto
    * al saldo disponiblr
    * 
    */
   public void Extraer(double p_importe){
       
       if(PuedeExtraer(p_importe)==true){
           Extraccion(p_importe);
       }else{
           System.out.println("HA ALCANZADO EL LIMITE DE EXTRACCIONES");
       }
   }
   
   
   /**
    * @param: p_importe: Modifica el saldo de la caja restando el saldo actual al tratarse de un deposito
    * 
    */ 
   public void Depositar (double p_importe){
       this.setSaldo(this.getSaldo()+p_importe);
   }
   
   /**
    * Imprinme los datos de l caja solicitados
    */
   public void Mostrar(){
       
       System.out.println("-    Caja de Ahorro    -");
       System.out.println("Nro cuenta: "+this.getNroCuenta());
       System.out.println("Saldo: "+this.getSaldo());
       System.out.println("Titular: "+this.getTitular().NomYaApe());
       System.out.println("Extracciones posibles:" +this.getExtraccionesPosibles());

       
       }
   
}
