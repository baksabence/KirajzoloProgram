package hu.szamalk;

import hu.szamalk.Modell.B;

public class Main {
    public static void main(String[] args) {
        B betu = new B('#');
        betu.betuKirajzolas();

        System.out.print("\n------TÖMBÖS FELADATOK------\n");

        System.out.println("JEL SZÁMLÁLÓ: ");
        System.out.println("\nAz első sorban " + betu.jelSzamolo(1,true) + " jel található");
        System.out.println("A második oszlopban " + betu.jelSzamolo(2,false) + " jel található");
        System.out.println("\nTELI VAN-E:");
        System.out.println("Az első sor tele van-e: " + betu.isTeli(1,true));
        System.out.println("Az második oszlop tele van-e: " + betu.isTeli(2,false));

    }
}