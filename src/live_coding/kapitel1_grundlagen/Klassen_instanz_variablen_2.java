package live_coding.kapitel1_grundlagen;
// (static): Klassen variablen, spaeter auch Methoden
// Instanz (oder objekt) variablen, spaeter auch Methoden

class Car {
    static String model;
    int preis;

    static void machnix(){
        Car mycar = new Car();
        mycar.preis = 6;

        Car.model = "audi";
        model = "audi";

        Klassen_instanz_variablen_2.model = "wefwea";
        Klassen_instanz_variablen_2.continent = "lala";

        Klassen_instanz_variablen_2 obj3 = new Klassen_instanz_variablen_2();
        obj3.land = "wer";
    }
}

public class Klassen_instanz_variablen_2 {
    String land;
    int alter;
    static String continent;
    static String planet;
    static String model;

    public static void main(String[] args) {
        Klassen_instanz_variablen_2 obj1 = new Klassen_instanz_variablen_2();
        Klassen_instanz_variablen_2 obj2 = new Klassen_instanz_variablen_2();

        model = "bmw";

        obj1.land = "DE";
        obj1.alter = 10;
        obj1.continent = "Europa";

        obj2.land = "FR";
        obj2.alter = 20;

        obj2.continent = "Asien";

        Klassen_instanz_variablen_2.continent = "Africa";
        Klassen_instanz_variablen_2.planet = "Erde";

        System.out.println(obj1.land);
        System.out.println(obj1.alter);
        System.out.println(obj1.continent);

        System.out.println("---------------");

        System.out.println(obj2.land);
        System.out.println(obj2.alter);
        System.out.println(obj2.continent);

        System.out.println("---------------");

        System.out.println(continent);
        System.out.println(planet);
    }
}
