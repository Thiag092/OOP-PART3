
/**
 * Abstraccion de un Rectangulo al cual se le solicita diferentes datos 
 * para su posterior publicacion y utilizacion en diferentes metodos
 * 
 * @author Yago Alberto Ayala.
 * @version 1.0.
 * 
 */
public class Rectangulo
{
        //Definicion de atributos;-------------------------------------------

    private Punto origen;
    private double ancho;
    private double alto;
    
    /**
     * Constructor de la clase Rectangulo.
     * 
     * @param: p_origen: Origen del r4ectangulo, siendo su centro de tipo Punto
     * @param: p_ancho: Medida del ancho del rectangulo
     * @param: p_alto: Medida del alto del rectangulo
     * 
     */
    public Rectangulo(Punto p_origen, double p_ancho,double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        
    }
    
    /**
     * Segundo Constructor de la clase Rectangulo. Donde el valor del origen ya esta pre definido
     * 
     * 
     * @param: p_ancho: Medida del ancho del rectangulo
     * @param: p_alto: Medida del alto del rectangulo
     * 
     */
        public Rectangulo(double p_ancho,double p_alto){
        
        this.setOrigen(new Punto (0,0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        
    }
    
    //Setters-------------------------------------------------------------
    
    /**
     * @param: p_nroDni:  Origen del r4ectangulo, siendo su centro de tipo Punto
     */
    
    private void setOrigen(Punto p_origen){
        this.origen=p_origen;
    }
    
    /** 
     * @param:p_ancho: Medida del ancho del rectangulo
     */
    private void setAncho(double p_ancho){
        this.ancho=p_ancho;
    }
    
    /**
     * @param: p_alto: Medida del alto del rectangulo
     */
    private void setAlto(double p_alto){
        this.alto=p_alto;
    }
    
    //Getteres------------------------------------------------------------
    
    
    /**
     * @return: Devuelve el centro del rectangulo de tipo Punto
     */
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
     * @return: Devuelve el ancho del rectangulo
     */
    public double getAncho(){
        return this.ancho;
    }
    
    
    /**
     * @return: Devuelve el ancho del rectangulo
     */
    public double getAlto(){
        return this.alto;
    }
    
    //----------------------------------------------------------------------
    
    /**
     * Modifica el centro del circulo de acuerdo a los paramtros de x e y nuevos que se provee
     * 
     * @param: p_dx: nuevo valor de x
     * @param: p_dy: nuevo valor de y
     */
    public void Desplazar(double p_dx, double p_dy){
        Punto nuevoOrigen= new Punto(p_dx, p_dy);
        this.setOrigen(nuevoOrigen);
    }
    
    /**
     * @return: devuelve el perimetro del circulo luego de realizar
     * los calculos correpsondientes
     * 
     */
    public double Perimetro(){
        double perimetro = 2*(this.getAlto() + this.getAncho());
        return perimetro;
    }
    
    /**
     * @return: Devuelve el valor de la superficie del circulo luego de ralizar los calculos
     * correspondientes
     */
    public double Superficie(){
        double superficie=this.getAncho() * this.getAlto();
        return superficie;
    }
    
    /**
     * @return: Devuelve la distancia de los centros de ambos rectangulos
     * luego de realizar los calculos correpsondientes
     * 
     * @param: otroRectangulo: Es el rectangulo con el cual se compara
     */
    public double DistanciaA(Rectangulo otroRectangulo){
        Punto centroActual = this.getOrigen();
        Punto centroOtro = otroRectangulo.getOrigen();

        double distancia = centroActual.DistanciaA(centroOtro);

        return distancia;
    }
    
    /**
     * @return: Devuelve el rectangulo amyor de a cuerdo a la comparatia que se realiza
     * @param: Rectangulo con el cual se compara
     */
    public Rectangulo ElMayor(Rectangulo otroRectangulo){
        if(this.Superficie()>otroRectangulo.Superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
        
    }
    
    /**
     * Imprime las caracteristicas dle rectangulo que se solicita
     */
    public void Caracteristicas (){
        System.out.println("***** Rectangulo*****");
        System.out.println("Origen: (" +this.getOrigen().getX()+", "+this.getOrigen().getY()+")");
        System.out.println("Alto: (" +this.getAlto()+" )");
        System.out.println("Ancho: (" +this.getAncho()+" )");
        System.out.println("Superficie: (" +this.Superficie()+" )");
        System.out.println("Perimetro: (" +this.Perimetro()+" )");

    }
    
    
    }
    
