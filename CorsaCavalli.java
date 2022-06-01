package corsacavalli;

import java.util.ArrayList;

public class CorsaCavalli {

    public static ArrayList<String> classifica = new ArrayList<String>();
    public static int lunghezzaPista = 100;

    public static void main(String[] args) {
        int c = 0;
        Cavallo c1 = new Cavallo("pippo");
        Cavallo c2 = new Cavallo("topolino");
        Cavallo c3 = new Cavallo("pluto");

        c1.start();
        c2.start();
        c3.start();

        while (c == 0) {
            if (!c1.isAlive() && !c2.isAlive() && !c3.isAlive()) {
                System.out.println("CLASSIFICA:");
                for (int i = 0; i < classifica.size(); i++) {
                    System.out.println(i+1 + ") " + classifica.get(i));
                }
                c=1;
            }
        }
    }

}
