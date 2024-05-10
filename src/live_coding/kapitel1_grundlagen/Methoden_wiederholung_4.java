package live_coding.kapitel1_grundlagen;

class Auto {
    String model;
    int preis;
    static String Herstellungsland;
}

class Land{
    static String hauptstadt;
}

public class Methoden_wiederholung_4 {

    void printSachen(){
        System.out.println("I love java");
        System.out.println("I love computer science");
        System.out.println("My name is Ammar");
        System.out.println("--------");
    }
    static int addiereZahlen(int x, int y){
        int ergebnis = x + y;
        return ergebnis;

    }

    public static void main(String[] args) {
        Land.hauptstadt = "Berlin";
        Land myland = new Land();
        myland.hauptstadt = "Berlin";

        Auto car1_obj = new Auto();
        Auto car2_obj = new Auto();

        car1_obj.model = "BMW";
        car1_obj.preis = 100;
        car1_obj.Herstellungsland = "Deutschland";
        System.out.println(car1_obj.Herstellungsland);

        car2_obj.model = "Mercedes";
        car2_obj.preis = 120;
        car2_obj.Herstellungsland = "France";

        System.out.println(car1_obj.Herstellungsland);
        System.out.println(car2_obj.Herstellungsland);

        Auto.Herstellungsland = "Holand";






        Methoden_wiederholung_4 obj1 = new Methoden_wiederholung_4();
        obj1.printSachen();

        //printSachen();
        int resultat1 = addiereZahlen(7, 10);
        int resultat2 = addiereZahlen(70, 10);
        int resultat3 = addiereZahlen(13, 8);

        System.out.println(resultat1);
        System.out.println(resultat2);
        System.out.println(resultat3);


    }
}
