/**
 *
 * @author Jesus Ivan
 */
public class Retiro extends Thread{
    private final Operacion operacion;
    
    public Retiro(Operacion operacion){
        this.operacion = operacion;
    }
    
    @Override
    public void run(){
        char valor;
        for(int i=0; i<10; i++){
            valor = operacion.retirar();
            System.out.println(" Retiro "+i+ ": "+ valor);
            try{
                sleep(100);
            } catch(InterruptedException e){}
        }
    }
}