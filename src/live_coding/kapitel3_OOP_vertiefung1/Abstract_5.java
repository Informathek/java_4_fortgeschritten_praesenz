package live_coding.kapitel3_OOP_vertiefung1;

/*
 * Agenda
 * ======
 * DONE --- 1. final (Modifier) keyword
 * DONE --- 2. access modifiers (public, private, protected)
 * DONE --- 3. Kapselung (Encapsulation): getters & setters
 * 4. abstract keyword & Interfaces & Enum
 * */

/* Abstraction: non-access modifier
 * 1. Mit Klassen: die Klasse kann nicht instanzieiren werden, kann aber zu einem sub-class erben
 * 2. Methoden:
 *
 * */



abstract class Laptop{
    int preis;

    // nicht jede methode in einer abstract class muss unbedingt abstract sein.
    void display(){
        System.out.println("das ist die Laptop Klasse");
    }

    // die Implementierung der Inhlat dieser Methode (printHi) muss in der sub-class angegeben wertden, weil vor der Methode steht das Keyword "abstract"
    // Achtung: eine abstract Methode kann sich nur in einer Abstract class befinden.
    abstract void printHi();
}

class Macbook extends Laptop{
    String farbe;

    void printHi(){
        System.out.println("Hi");
    }
}

public class Abstract_5 {
    public static void main(String[] args) {
        // Laptop laptop = new Laptop(); gibt ein error aus, da Laptop ist eine abstracte klasse, und somit darf ich kein Objekt machen
        Macbook macbook = new Macbook(); // Instanz-iieren
        System.out.println(macbook.farbe);
        System.out.println(macbook.preis);
        int x;
        x = 7; // Initial_isieren
    }
}
