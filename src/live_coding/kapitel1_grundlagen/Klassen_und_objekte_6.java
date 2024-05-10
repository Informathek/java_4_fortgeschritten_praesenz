package live_coding.kapitel1_grundlagen;

class Mensch {
    String name;
    double gewicht; // variable
    static String wohnort = "Berlin";

    static void laufen(){ //geschweifte Klammer, methode
        System.out.println("Wir sind jetzt in der laufen methode in der Mensch class");
    }

}

public class Klassen_und_objekte_6 {
    public static void main(String[] args) {
        // Mensch.wohnort = "Berlin";
        Mensch.laufen();

        Mensch mensch1 = new Mensch(); // objekte, instanzen, beispiele
        Mensch mensch2 = new Mensch();

        mensch1.gewicht = 10;
        mensch2.gewicht = 20;

        mensch1.name = "Ramez";
        mensch2.name = "Reem";

    }
}
