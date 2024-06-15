package live_coding.kapitel3_OOP_vertiefung;


interface Mensch {
    void display();
    void printHi();
}


class Kind implements Mensch{
    String farbe;

    public void display(){
        System.out.println("das ist die Laptop Klasse");
    }

    public void printHi(){
        System.out.println("Hi");
    }
}


public class Interface_6 {
    public static void main(String[] args) {
        Kind mensch = new Kind();
    }
}
