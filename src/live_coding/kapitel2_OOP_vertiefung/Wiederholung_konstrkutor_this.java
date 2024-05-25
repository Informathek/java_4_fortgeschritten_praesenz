package live_coding.kapitel2_OOP_vertiefung;

class Laptop{
    int preis;
    static String model;

    Laptop(){
    }

    Laptop(int preis){
        this.preis = preis;
    }

    Laptop(int preis, String modell){
        this.preis = preis;
        this.model = modell;
    }

}

public class Wiederholung_konstrkutor_this {
    static String model;
    public static void main(String[] args) {
        model = "Samsung"; // das gleiche wie unten
        Wiederholung_konstrkutor_this.model = "Apple";

        Laptop mylaptop1 = new Laptop(999, "Apple");

        System.out.println(mylaptop1.preis); // 999
        System.out.println(mylaptop1.model); /// apple

        mylaptop1.preis = 1000;
        mylaptop1.model = "Acer";
        Laptop.model = "Toshiba";

        System.out.println(mylaptop1.preis); // 1000
        System.out.println(mylaptop1.model); // Toshiba

        Laptop myLaptop2 = new Laptop();
        myLaptop2.preis = 1000;
        myLaptop2.model = "Acer";

        Laptop myLaptop3 = new Laptop(888);

    }
}
