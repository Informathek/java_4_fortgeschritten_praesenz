package live_coding.kapitel3_OOP_vertiefung;

/*
 * Zugriffsmodifikatoren: sie bestimmen, an welcher Stelle im Code habe ich zugriff auf eine bestimte variable, methode, classe, etc.
 * 1. public: zugriff ueberall (auch wenn der code (variable, methoden, Klassen)) in anderen Paketen definiert ist)
 * 2. "default": dieser code wird nur innerhalb des selben Paketes gesehen.
 * 3. protected:
 * 4. private:
 */

//class Reem {
//    String nachname = "alsheikha";
//}

import live_coding.kapitel2_OOP_vererbung.Zugriffsmodifikator_teil2;


class Mohammad{
    static String defaultName;
    private static String privateName;

    void display(){
        System.out.println(defaultName);
        System.out.println(privateName);
    }

    Mohammad(String defaultName, String privateName){
        this.defaultName = defaultName;
        this.privateName = privateName;
    }
}

public class Zugriffsmodifikator_teil1 {
    static int teil1;
    public static void main(String[] args) {
        Zugriffsmodifikator_teil2.teil2 = 2;
        // Zugriffsmodifikator_teil2.ammar_nicht_public_varible = 6; // ammar_nicht_public_varible wird nicht erkannt, weil die varibale zwar in einr pub;ic class definiert, jedoch sich selbst nicht public ist und wir befinden uns in einem verschiedenen Packet.
        Zugriffsmodifikator_teil3.teil3 = 3;

        // Reem.name = "reem"; // wird nicht erkannt, weil die Klasse reem ist in einem anderen Packet defineirt.
        Esraa.alter = 20; // wird erkann, weil Esraa und Zugriffsmodifikator_teil1 Klassen sind innerhalb der selben Packert defineirt.

        Mohammad.defaultName = "Mo";
        // Mohammad.privateName = // error, weil privateName ist private
    }
}
