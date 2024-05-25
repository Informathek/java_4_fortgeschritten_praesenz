package live_coding.kapitel2_OOP_vertiefung;

// super class
class Animal{
    int gewicht;
    int age = 9;
    static String rasse = "BKH";

    public String toString() {
        return "Das Gewicht ist: " + gewicht + "\nDas Alter ist: " + age + "\nDie Rasse ist " + rasse;
    }
}

// subclass
class Hund extends Animal{
    String name;
}

public class Vererbung_1 {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        System.out.println("-------rasse kommt darunter------");

        System.out.println(animal1.rasse); // BKH
        System.out.println(animal2.rasse); // BKH
        System.out.println(Animal.rasse); // BKH

        animal1.rasse = "DingDong";
        System.out.println(animal1.rasse); //DingDong
        System.out.println(animal2.rasse); // DingDong
        System.out.println(Animal.rasse); // DingDong

        System.out.println("-------gewicht kommt darunter------");

        System.out.println(animal1.gewicht); // 0
        System.out.println(animal2.gewicht); // 0
        // System.out.println(Animal.gewicht); gibt ein error aus, weil gewicht niocht static ist

        animal1.gewicht = 55;
        System.out.println(animal1.gewicht); // 55
        System.out.println(animal2.gewicht); // 0

        System.out.println("-------age kommt darunter------");

        System.out.println(animal1.age); // 9
        System.out.println(animal2.age); // 9

        animal1.age = 77;
        System.out.println(animal1.age); // 77
        System.out.println(animal2.age); // 9

        System.out.println("-------toString------");

        // die beiden naechsten Zeilen sind identisch
        System.out.println(animal1); // live_coding.kapitel2_OOP_vertiefung.Animal@30f39991
        System.out.println(animal1.toString()); // live_coding.kapitel2_OOP_vertiefung.Animal@30f39991

        System.out.println(animal1.gewicht); // 55
        System.out.println(animal1.age); // 55
        System.out.println(animal1.rasse); // 55

        System.out.println("Die folgenden zwei Zeilen sind identisch\n");
        System.out.println(animal1.toString());
        System.out.println("======");
        System.out.println(animal1);
//        Das Gewicht ist: 55
//        Das Alter ist: 77
//        Die Rasse ist DingDong
        System.out.println(animal2);
//        Das Gewicht ist: 0
//        Das Alter ist: 9
//        Die Rasse ist DingDong

        System.out.println("\n*********************************");
        System.out.println("*********** Vererbung ***********");
        System.out.println("*********************************\n");


        Hund hund1 = new Hund();
        System.out.println(hund1.name); // null
        System.out.println(hund1.gewicht); // 0 (weil gewicht hat den Wert 0 als default und wurde nicht initialisert).
        System.out.println(hund1.age); // 9
        System.out.println(hund1.rasse); // DingDong

        Animal.rasse = "XYZ";
        System.out.println(Animal.rasse); // XYZ
        System.out.println(Hund.rasse); // XYZ

        Hund.rasse = "Haski";
        System.out.println(Animal.rasse); // Haski
        System.out.println(Hund.rasse); // Haski

        System.out.println("\nwir wollen die nicht-ststische Varbaiblen des kindes aendern und sehen, ob die Vater's Variablen sich veraendern.\n");

        System.out.println(hund1.gewicht); // 0
        System.out.println(animal1.gewicht); // 55
        hund1.gewicht = 987;
        System.out.println(hund1.gewicht); // 987
        System.out.println(animal1.gewicht); // 55

        System.out.println("000000000000000000");

        System.out.println(hund1.age); // 9
        System.out.println(animal1.age); // 77
        hund1.age = 8;
        System.out.println(hund1.age); // 8
        System.out.println(animal1.age); // 77

    }
}
