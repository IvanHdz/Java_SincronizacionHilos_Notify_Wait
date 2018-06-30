/**
 *
 * @author Jesus Ivan
 */
public class Operacion {
    private char contenido;
    private boolean disponible = false;
    
    public Operacion(){
    }
    
    public synchronized char retirar(){
        //Mientras disponible tenga un parametro negrativo ! osea este en falso.
        while(!disponible){
            try{
                wait();
            } catch(InterruptedException e){}
        }
       disponible=false;
       notify();
       return contenido;
   }
        
    public synchronized void depositar(char valor){
        //Mientras el valor disponible se encuentre en estado verdadero.
        while(disponible){
            try{
                wait();
            } catch(InterruptedException e){}
        }
        contenido = valor;
        disponible = true;
        notify();
    }
}