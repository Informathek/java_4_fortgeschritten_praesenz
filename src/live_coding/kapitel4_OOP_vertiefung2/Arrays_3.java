package live_coding.kapitel4_OOP_vertiefung2;
// Agenda:
// DONE: 1. Listen motivation
// Done: 2. Objekt Class
// Done: 3. abstract / interface
// Done: 4. arrays
// 5. String / new String / String methods
// 6. wrapper class allgemein
// 7. interger Class
// 8. collection framework


public class Arrays_3 {

    public static void main(String[] args) {
        // 1.Situation: Array erstellung, wenn inhalt bei der Erstellung unbekannt ist
        // 1.a Lange schreibweise
        int preis1; // 1. dekeration
        preis1 = 17;// 2. intialisierung

        int[] preisArr; // 1. dekeration
        preisArr = new int[5]; // 2. allozieren
        preisArr[0] = 17;// 3. intialisierung
        preisArr[1] = 7;// 3. intialisierung
        preisArr[2] = 87;// 3. intialisierung
        preisArr[3] = 97;// 3. intialisierung
        preisArr[4] = 17;// 3. intialisierung

        // 1.b Kurze schreibweise
        // normale Variable
        int preis2 = 18; // dekeration und intialisierung

        String[] preisArr2 = new String[5]; // 2. allozieren
        preisArr2[0] = "17";// 3. intialisierung
        preisArr2[1] = "7";// 3. intialisierung
        preisArr2[2] = "87";// 3. intialisierung
        preisArr2[3] = "97";// 3. intialisierung
        preisArr2[4] = "17sdgf";// 3. intialisierung

        // ---------------------------------------------------------------------
        // 2. Array erstellung, wenn inhalt direkt bei der erstellung bekannt ist
        // 2.a Lange schreibweise
        int[] preisArr3 = new int[]{7, 20 ,1};

        // 2.b Kurze schreibweise
        int[] preisArr4 = {7, 20 ,10, 9};
        preisArr4[2] = 87;// ueberschreibe die 10 mit 87.

//        ======= print array in allen  faellen:
        System.out.println(preisArr4[2]);

        for (int i = 0; i < preisArr4.length; i++){
            System.out.println(preisArr4[i]);
        }
        String[] namenArr = {"reem", "esraa"};


    }
}
