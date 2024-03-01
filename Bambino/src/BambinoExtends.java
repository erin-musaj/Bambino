import java.util.logging.Level;
import java.util.logging.Logger;

public class BambinoExtends extends Thread{
    private int metriPercorsi;

    public BambinoExtends(String nome) {
        metriPercorsi = 0;
        this.setName(nome);
    }

    @Override
    public void run() {
        boolean continua = true;
        while (continua) {
            int c = (int) (Math.random() * 10) + 1;
            metriPercorsi += c;
            System.out.println(this.getName() + " ha fatto " + c + " passi");
            System.out.println("Passi totali di " + this.getName() + ": " + metriPercorsi);
            if(Main.TRAGUARDO <= metriPercorsi){
                continua = false;
            } else {
                System.out.println((this.getName() + " riposa"));
                try{
                    this.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(BambinoExtends.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Main.posizione++;
        System.out.println(this.getName() + " è arrivato: " + Main.posizione);
    }
}
