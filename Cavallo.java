package corsacavalli;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cavallo extends Thread {

    private String nome;
    private double velocita;

    public Cavallo(String nome) {
        this.nome = nome;
        this.velocita = Math.random() * 10 + 5;
    }

    public void run() {
        for (int lung = CorsaCavalli.lunghezzaPista; lung > 0; lung -= (int)velocita) {
            if (lung > 0) {
                System.out.println(nome + "  metri al traguardo: " + lung);
            }
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cavallo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        CorsaCavalli.classifica.add(nome);
    }
}
