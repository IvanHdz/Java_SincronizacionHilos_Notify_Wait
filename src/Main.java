/**
 *
 * @author Jesus Ivan
 */
public class Main {
    public static void main(String [] args){
        Operacion b = new Operacion();
        Deposito p = new Deposito(b);
        Retiro c = new Retiro(b);
        p.start();
        c.start();
    }
}