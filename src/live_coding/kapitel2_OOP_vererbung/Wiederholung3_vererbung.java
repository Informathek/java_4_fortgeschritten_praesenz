package live_coding.kapitel2_OOP_vererbung;

class Kleidung{
    int quali;
    double preis = 10;
    static String firmenName;

    Kleidung(){
        this(10, 24.99, "New Yorker");
        System.out.println("das ist ein leeres Konstruktor von Kleidung");
    }

    Kleidung(int quali, double preis){
//        this.quali = quali;
//        this.preis = preis;
        this(quali, preis, "Adidas");
        System.out.println("das ist ein Konstruktor von Kleidung mit 2 Args");
    }

    Kleidung(int quali, double preis, String firmenName){
        this.quali = quali;
        this.preis = preis;
        this.firmenName = firmenName;
        System.out.println("Das ist ein Konstrukor von Kleidung mit 3 args");
    }

    void printSomething(){
        System.out.println("Heute ist Freitag");
    }

    public String toString(){
        return "Quali: " + quali + ", Preis: " + preis + ", FirmName: " + firmenName;
    }
}

class Hose extends Kleidung{
    int quali;
    double preis = 20;
    String size;

    Hose(){
        System.out.println("das ist ein leeres Konstruktor von Hose");
    }

    Hose(int quali, double preis, String size){
        this.quali = quali;
        this.preis = preis;
        this.size = size;
        System.out.println("das ist ein Konstruktor von Hose mit 2 args");
    }

    void printSomething(){
        System.out.println("Heute ist Freitag");
    }

    public String toString(){
        return "Quali: " + quali + ", Preis: " + preis + ", size: " + size + ", firemName: " + firmenName;
    }

}

public class Wiederholung3_vererbung {
    public static void main(String[] args) {
        Kleidung kleidung1 = new Kleidung(); //
        Kleidung kleidung2 = new Kleidung(11, 25.99, "New Yorker");

//        System.out.println(kleidung1); // Quali: 0, Preis: 10.0, FirmName: null
//        System.out.println(kleidung2); // Quali: 10, Preis: 24.99, FirmName: null
//
//        Hose hose1 = new Hose();
//        Hose hose2 = new Hose(4, 99.99, "XXL");
//        System.out.println(hose1); // Quali: 0, Preis: 20.0, size: null, FirmName: New Yorker
//        System.out.println(hose2); // Quali: 4, Preis: 99.99, size: XXL, FirmName: New Yorker

    }
}
