/**
 *
 * @author Jesus Ivan
 */
public class Deposito extends Thread {
    private Operacion operacion;
    private final String letras ="abcdefghijklmnñopqrstuvxyz";
    
    public Deposito(Operacion operacion){
        this.operacion = operacion;
    }
    
    @Override
    public void run(){
        for(int i=0; i<10; i++){
       //charAt devuelve el carácter que está situado en la posición indicada.
       //Extrae un caracter de un String. charAt es de la clase String.
            char c=letras.charAt((int)(Math.random()* letras.length()));
            System.out.println(" Depósito "+i +": "+ c);

            operacion.depositar(c);
            try{
                sleep(400);
               } catch(InterruptedException e){}
        }
    }
}