package live_coding.kapitel4_OOP_vertiefung2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


interface Collection_{
    public void add();
}

interface List_ extends Collection_ {

    public void remove();

}

class ArrayList_ implements List_{
    public void add() {
        System.out.println("hi");
    }

    public void remove() {
        System.out.println("hi");
    }
}

class LinkedList implements List_{
    public void add() {
        System.out.println("hi");
    }

    public void remove() {
        System.out.println("hi");
    }
}

public class List_7 {
    public static void main(String[] args) {

//        List<Integer> list_int4 = new List<>();
//        ArrayList<Integer> list_int3 = new List<>();

        ArrayList<Integer> arrayList_int1 = new ArrayList<>();
        List<Integer> list_int2 = new ArrayList<>();

        list_int2.add(7);
        System.out.println(list_int2);



    }
}
