package live_coding.kapitel3_OOP_vertiefung;


class Buch{
    private int anzahlSeiten;
    private double preis;

    void setAnzahlSeiten(int anzahlSeiten){
        this.anzahlSeiten = anzahlSeiten;
    }

    void setPreis(double preis){
        this.preis = preis;
    }

    int getAnzahlSeiten(){
        return anzahlSeiten;
    }

    int getPreis(){
        return anzahlSeiten;
    }
}

public class Kapselung_getter_setter_4 {
    public static void main(String[] args) {
        Buch buch = new Buch();

        buch.setAnzahlSeiten(100);
        buch.setPreis(99.99);

        int preis = buch.getPreis();
        int anzahlSeiten = buch.getAnzahlSeiten();

        System.out.println(preis);
        System.out.println(anzahlSeiten);

    }
}
