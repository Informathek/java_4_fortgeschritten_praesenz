package live_coding.kapitel2_OOP_vertiefung;

class Mutter{
    int geld = 9;
}

class Kind extends Mutter{
    String vorname;
    int geld;
}


public class Vererbung_1 {
    public static void main(String[] args) {
        Mutter mutter = new Mutter();
        System.out.println("Geld des mutters: " + mutter.geld);

        Kind kind = new Kind();
        System.out.println("Geld des Kindes: " + kind.geld);
    }
}
