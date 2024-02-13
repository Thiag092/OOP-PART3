
/**
 * Abstraccion de un Circulo al cual se le solicita diferentes datos
 *  para su posterior publicacion.
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Circulo
{
    //Definicion de atributos;-------------------------------------------
    
    private double radio;
    private Punto centro;
    
    /**
     * Constructor de la clase Circulo.
     * cuyos valores ya ya se encuentra pre definidos
     * 
     */
    public Circulo (){
        this.setRadio(0);
        this.setCentro(new Punto (0,0));
    }
    
    /**
     *Segundo Constructor de la clase Circulo.
     * 
     * @param: p_radio: Radio del circulo
     * @param: p_centro; Centro del circulo, determinado por un objeto
     * de clase Punto
     * 
     */
    public Circulo (double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    //Definimos los setters--------------------------------------------
     /**
     * @param: p_radio: Radio del circulo
     */
    private void setRadio(double p_radio){
        this.radio=p_radio;
    }
    
     /**
     * @param: p_centro; Centro del circulo, determinado por un objeto
     * de clase Punto
     */
        private void setCentro(Punto p_centro){
        this.centro=p_centro;
    }
    
    //Definimos los getters--------------------------------------------
    
     /**
     * @return: devuelve el radio establecido del circulo
     */
        public double getRadio(){
        return this.radio;
    }
    
     /**
     * @return: devuelve el centro del circulo establecido de tipo Punto
     */
    public Punto getCentro(){
        return this.centro;
    }
    
     /**
     * @return: Devuelve la superficie del Circulo
     * luego de realizar el calculo correspondiente
     */
    public double Superficie(){
        double pi=3.14;
        
        return( pi * (Math.pow(this.radio, 2)));
    }
    
     /**
     * @return: Devuelve el perimetro del circulo
     * luego de realizar el calculo correspondiente
     */
    public double Perimetro (){
        double pi=3.14;
        
        return 2 * (pi*this.radio);
    }
    
     /**
     *Imprime las caracteristicas solicitadas del Circulo
     */
    public void Caracteristicas(){
        System.out.println("***** Circulo *****");
        System.out.println("\n Centro: (" + this.getCentro().getX()+", "+this.getCentro().getY()+" )");
        System.out.println("\nRadio: " +this.getRadio());
        System.out.println("\n Superficie: " + this.Superficie());
        System.out.println("\n Perimetro: " + this.Perimetro());
    }
    
     /**
     * @return: devuelve cual de los dos circulos es el mayor, el original
     * o el pasado como parametro
     * 
     * @param: otroCirculo: circulo necesario para realizar la comparacion
     */
    public Circulo ElMayor(Circulo otroCirculo){
        if (this.Superficie() > otroCirculo.Superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
    
    /**
     *Desplaza el centro del circulo con los parametros pasados
     *@param:p_dx: nuevo punto x del centro
     *@param:p_dy: nuevo punto y del centro
     */
    public void Desplazar (double p_dx, double p_dy){
        Punto nuevoPunto = new Punto (p_dx, p_dy);
        
        this.setCentro(nuevoPunto);
        
    }
    
    /**
     *
     *@return: Devuelve la distancia de los centro de ambos circulos
     *luego de realizar el correspondiente calculo y comparativa
     *
     *@param: otroCirculo: Circulo con le cual se compara
     */
     public double DistanciaA(Circulo otroCirculo){
        Punto centroActual = this.getCentro();
        Punto centroOtro = otroCirculo.getCentro();

        double distancia = centroActual.DistanciaA(centroOtro);

        return distancia;
        }

}
