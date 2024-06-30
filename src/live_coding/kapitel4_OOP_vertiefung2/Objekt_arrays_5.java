package live_coding.kapitel4_OOP_vertiefung2;

// Arrays
// Collection, List, Set, Queue, Map
// Error handling (Fehlerbehandlung)
// Tests

class Gemuse{
    int anzahl;
    String name;
    double preis;
}

class Animal{
    String name;
    int alter;
}

public class Objekt_arrays_5 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        String[] arr2 = new String[4];
        Gemuse[] arr3 = new Gemuse[4];
        Animal[] arr4 = new Animal[5];

//        -----------
        Gemuse gemuse_obj1 = new Gemuse();
        gemuse_obj1.anzahl = 1;
        gemuse_obj1.name = "kartofel";
        gemuse_obj1.preis = 10.99;

        Gemuse gemuse_obj2 = new Gemuse();
        gemuse_obj2.anzahl = 1;
        gemuse_obj2.name = "bananen";
        gemuse_obj2.preis = 10.99;

        Gemuse gemuse_obj3 = new Gemuse();
        gemuse_obj2.anzahl = 12;
        gemuse_obj2.name = "apfel";
        gemuse_obj2.preis = 10.99;

//        -----------
        Animal animal_obj1 = new Animal();
        animal_obj1.alter = 1;
        animal_obj1.name = "hund";

//        -------------

        arr1[0] = 1;
        arr1[1] = 14;
        arr1[2] = 8;

        arr2[0] = "sdf";
        arr2[1] = "sdfs";
        arr2[2] = "Sdfdf";

        arr3[0] = gemuse_obj1;
        arr3[1] = gemuse_obj2;
        arr3[2] = gemuse_obj3;

        arr4[0] = animal_obj1;

        System.out.println(gemuse_obj1.anzahl);
        System.out.println(arr3[0].anzahl);
//        System.out.println(arr3[0].anzahl);


    }
}
