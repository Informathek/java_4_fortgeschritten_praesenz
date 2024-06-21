package live_coding.kapitel3_OOP_vertiefung1;

// final class Animal{: wenn ich das auskommentiere, dann bekomme ich ein error, weil Mouse darf nicht mehr bon Animal erben
class Animal{
    // wegen "final" kann diese methode in der sub-class nicht ueberschrieben werden
    final void display(){
        System.out.println("Das ist ein Animal");
    }
}

class Mouse extends Animal{
//    void display(){
//        System.out.println("Das ist eine Maus");
//    }
}

public class Final_1 {
    // final
    // ====
    // 1. variablen: der Wert der final variable kann nicht mehr veraendert werden.
    // 2. Methoden: die final Methode kann nicht mehr ueberschrieben werden (in der Vererbung!!!!!!)
    // 3. Klassen: die final klasse kann nicht mehr verwerbt werden (also erbt niemanden mehr)


    final int preis1 = 10;
    final int preis2;
    {     // initialization block
        preis2 = 20;
    }

    static final String autoFarbe1 = "red";
    static final String autoFarbe2;
    static {     // initialization block
        autoFarbe2 = "blau";
    }


    public static void main(String[] args) {
        System.out.println("------------ (final) mit Variablen ------------");

        final double PI = 3.14;
        final String DE_TELEFON_NUMMER;
        DE_TELEFON_NUMMER = "+49";
        // DE_TELEFON_NUMMER = "+49";

        System.out.println("------------ (final) mit Methoden ------------");
        Mouse mouse = new Mouse();
        mouse.display();
    }
}
