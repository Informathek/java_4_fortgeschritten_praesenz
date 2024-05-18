package live_coding.kapitel1_OOP_grundlagen;

class Uni{
    String name;
    int anzahlStudenten;
    int anzahlProfs;
    char stadt;

    Uni(){
    }

    Uni(String myName){
        name = myName;
    }

    Uni(String myName, char myStadt){
        name = myName;
        stadt = myStadt;
    }

    Uni(String myName, int myAnzahlStudenten, int myAnzahlProfs, char myStadt){
        name = myName;
        anzahlStudenten = myAnzahlStudenten;
        anzahlProfs = myAnzahlProfs;
        stadt = myStadt;
    }

}
public class Konstruktoren_7 {
    public static void main(String[] args) {
        Uni uni1 = new Uni("HTW", 40000, 3000, 'B');
        Uni uni2 = new Uni();
        Uni uni3 = new Uni("TU", 4000, 300, 'K');
        Uni uni4 = new Uni("FU", 5000, 540, 'B');
        Uni uni5 = new Uni("HU");
        Uni uni6 = new Uni("AliceS", 'B');

        System.out.println(uni4.anzahlStudenten);
//        uni1.name = "HTW";
//        uni1.anzahlStudenten = 40000;
//        uni1.anzahlProfs = 3000;
//        uni1.stadt = 'B';
//
//        uni2.name = "TU";
//        uni2.anzahlStudenten = 41000;
//        uni2.anzahlProfs = 3000;
//        uni2.stadt = 'B';

//        System.out.println(uni1.name);

        uni2.name = "Beuth";
        uni2.stadt = 'B';

    }
}
