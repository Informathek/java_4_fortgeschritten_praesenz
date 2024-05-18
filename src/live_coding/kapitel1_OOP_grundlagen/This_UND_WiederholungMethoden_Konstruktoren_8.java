package live_coding.kapitel1_OOP_grundlagen;

class Laptop{
    int preis; // variable oder auch attribut gennant
    static String model;

    void printMethod(){
        System.out.println("Ich bin in der Laptop-Klasse");
    }

     static double berechneRechteckFlaeche(double a, double b){
        double flaeche = a * b;
        return flaeche;
    }

    Laptop(){
    }

    Laptop(int preis){
        this.preis = preis;
    }

    Laptop(int preis, String model){
        this.preis = preis;
        this.model = model;
    }

}
public class This_UND_WiederholungMethoden_Konstruktoren_8 {
    public static void main(String[] args) {
        Laptop.model = "SAMSUNG";

        Laptop mylaptop1 = new Laptop();
        mylaptop1.preis = 1500;
        mylaptop1.printMethod(); // aufruf der methode

        Laptop mylaptop2 = new Laptop();
        mylaptop2.preis = 800;
        mylaptop2.printMethod();

        System.out.println(Laptop.model);
        double Dieflaeche = Laptop.berechneRechteckFlaeche(5.8, 4);

        Laptop mylaptop3 = new Laptop(800, "Samsung");
        System.out.println("mylaptop3 preis is:" + mylaptop3.preis);

        Laptop mylaptop4 = new Laptop(1000);
        Laptop.model = "MacBook";
        System.out.println("mylaptop4 preis is: " + mylaptop4.preis); // 1000
        System.out.println("mylaptop4 model is: " + Laptop.model); // MacBook
    }
}
