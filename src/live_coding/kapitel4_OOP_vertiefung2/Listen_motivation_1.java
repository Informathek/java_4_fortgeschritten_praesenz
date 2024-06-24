package live_coding.kapitel4_OOP_vertiefung2;

import java.util.ArrayList;

// Agenda:
// 1. Listen motivation
// 2. Objekt Class
// 3. arrays
// 4. String / new String / String methods
// 5. wrapper class allgemein
// 6. interger Class
// 7. interface
// 8. collection framework


class Car{
    int preis;
}
public class Listen_motivation_1 {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        Car myCar = new Car();

        myArrayList.add("reem");
        myArrayList.add("rita");
        myArrayList.add("khaled");

        myArrayList.set(0, "Ammar");

        System.out.println(myArrayList);
    }
}
