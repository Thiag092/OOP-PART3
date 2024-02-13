

/**
 * Abstraccion de una cuenta corriente al cual se le solicita diferentes datos
 * para su posterior publicacion y manejo segun los metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
    public class CuentaCorriente {
     //Definicion de atributos;-------------------------------------------

  private int nroCuenta;
  private double saldo;
  private double limiteDescubierto;
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
         * @return: Deuvele el limite de descubierto dela cuenta
         */
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }

    /**
         * @param: p_limiteDescubierto: limite de descubierto de la cuenta
         */
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
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
     * Constructor de la clase CuentaCorriente.
     * 
     * @param: p_nroCuenta: Numero de cuetna
     * @param: p_titular titular de la cuenta
     * 
     */
     public CuentaCorriente(int p_nroCuenta, Persona p_titular){
      this.setNroCuenta(p_nroCuenta);
      this.setSaldo(0);
      this.setLimiteDescubierto(500);
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
      public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
      this.setNroCuenta(p_nroCuenta);
      this.setSaldo(p_saldo);
      this.setLimiteDescubierto(500);
      this.setTitular(new Persona(0,""," ",null));
      }
      
      /**
       * @return: devuelve un valor boolean de acuerdo a si es posible realizar la extraccion solicitada
       * en relacion con el limite d edescubierto
       * @param: p_importe: importe que se desea extraer
       */
    public boolean PuedeExtraer(double p_importe){
      double limite=this.getSaldo()+this.getLimiteDescubierto();
       if ( p_importe<=limite){
            
           return true;
       }else{
           return false;
       }
       
       }
       
       /**
        * Realiza la extraccion del saldo pasado como parametro, disminuyendo el saldo
        */
       public void Extraccion(double p_importe){
       
           this.setSaldo(this.getSaldo()-p_importe);
       }
   
       /**
        * Realiza una comprobacion con respecto a si el importe pasado com parametro
        * esta disponible con respecto al saldo
        * 
        * @param: p_importe: importe que se desea extraer
        */
   public void Extraer(double p_importe){
       
       if(PuedeExtraer(p_importe)==true){
           Extraccion(p_importe);
       }else{
           System.out.println("*******************************************************************");
           System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
           System.out.println("*******************************************************************");
       }
   }
   
   /**
    * Suma el improte que se esta depositando al saldo
    * @param: p_importe: importe que se suma al saldo al tratarse de un deposito
    */
   public void Depositar (double p_importe){
       this.setSaldo(this.getSaldo()+p_importe);
       }

       /**
     *Imprime los datos solicitados con respecto a la cuenta
     *tales como el titular saldo, descuebioerto y nro de cunta
     */
      public void Mostrar(){
       
       System.out.println("-    Cuenta Corriente    -");
       System.out.println("Nro cuenta: "+this.getNroCuenta());
       System.out.println("Saldo: "+this.getSaldo());
       System.out.println("Titular: "+this.getTitular().NomYaApe());
       System.out.println("Descubierto:" +this.getLimiteDescubierto());
           }
}