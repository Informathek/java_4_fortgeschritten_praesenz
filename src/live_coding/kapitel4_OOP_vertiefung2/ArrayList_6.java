package live_coding.kapitel4_OOP_vertiefung2;
// <> = <>()
// spitzklammer gleich spirzklammer rundklammer

import java.util.ArrayList;

class Laptop{
    int preis;
    String name;
}

// wrapper class
//class Integer{
//    int nummer;
//}



public class ArrayList_6 {
    public static void main(String[] args) {
//        Laptop laptop_obj = new Laptop();

        int[] arrInt = new int[5]; // int arr
        Laptop[] arrLaptops1 = new Laptop[4];// Laptop arr



        ArrayList<Integer> arrList_integers = new ArrayList<>();
//        ArrayList<Laptop> arrList_laptops = new ArrayList<>();

        System.out.println(arrList_integers);
        arrList_integers.add(0);
        arrList_integers.add(1);
        System.out.println(arrList_integers); // 0 , 1
        System.out.println(arrList_integers.get(0)); // 0

        int y = arrInt[0];
        int x = arrList_integers.get(1);
        System.out.println(x); // 1

        arrList_integers.set(1, 8); // setze inhalt an der stelle 0 auf 8.
        System.out.println(arrList_integers);
        System.out.println("------");

        arrList_integers.add(1000); // [0, 8, 1000]
        System.out.println(arrList_integers.size()); // 3

        arrList_integers.remove(1); // [0, 1000]
        System.out.println(arrList_integers);

        arrList_integers.add(1, 200);
        System.out.println(arrList_integers);

        arrList_integers.clear();
        System.out.println(arrList_integers);





        Laptop laptop_obj1 = new Laptop();
        Laptop laptop_obj2 = new Laptop();
        Laptop laptop_obj3 = new Laptop();
        Laptop laptop_obj4 = new Laptop();
        Laptop laptop_obj5 = new Laptop();
        Laptop laptop_obj6 = new Laptop();



        // normales arr
        Laptop[] Laptops_arr = new Laptop[4];// Laptop arr
        Laptops_arr[0] = laptop_obj1;
        Laptops_arr[1] = laptop_obj2;
        Laptops_arr[2] = laptop_obj3;
        Laptops_arr[3] = laptop_obj4;

        // arr list
        ArrayList <Laptop> arrayList_laptops = new ArrayList<>();
        arrayList_laptops.add(laptop_obj1);
        arrayList_laptops.add(laptop_obj2);
        arrayList_laptops.add(laptop_obj3);
        arrayList_laptops.add(laptop_obj4);
        arrayList_laptops.add(laptop_obj5);
        arrayList_laptops.add(laptop_obj6);

        arrayList_laptops.add(laptop_obj1);
        arrayList_laptops.add(laptop_obj1);
        arrayList_laptops.add(laptop_obj1);
        arrayList_laptops.add(laptop_obj1);

    }
}
