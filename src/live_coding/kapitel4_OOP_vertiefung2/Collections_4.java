package live_coding.kapitel4_OOP_vertiefung2;

import java.util.ArrayList;
import java.util.List;

public class Collections_4 {
    public static void main(String[] args) {
        int[] intArr = new int[3]; // pure array
        Car[] carArr = new Car[3]; // pure array
//        Auto[] carArr = new Auto[3]; // pure array

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

//        Auto auto1 = new Auto();

        carArr[0] = car1;
        carArr[1] = car2;
        carArr[2] = car3;


        ArrayList<Integer> intList1 = new ArrayList<>(); // ArrayList
        ArrayList<Car> carList = new ArrayList<>(); // ArrayList

        carList.add(car1);

        intList1.add(7);
        intList1.add(9);
        intList1.add(70);
        intList1.add(73);

        System.out.println(intList1);

        intList1.set(0,100);

        int n = intList1.get(6);
        intList1.size();


    }
}
