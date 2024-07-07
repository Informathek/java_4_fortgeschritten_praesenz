package live_coding.kapitel4_OOP_vertiefung2;

import com.sun.jdi.IntegerValue;

import java.util.*;

public class Collection_8 {
    public static void main(String[] args) {
        // normales array
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 1;

        // list and array list
        // wrapper class
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(6);
//        arrayList.add(3);
//        arrayList.add(8);
//        System.out.println(arrayList);

//        list.remove();

        // queue
        Queue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(8);
        queue.add(9);

        System.out.println(queue);

        queue.remove(); // remoeve first element with hint. FIFO: first in, first out
        queue.poll(); // remove first elment without a hint. FIFO: first in, first out

        System.out.println(queue);

        int x1 = queue.element();
        int x2 = queue.peek();

        System.out.println(x1);
        System.out.println(x2);

        System.out.println(queue);


        System.out.println("---------------");
        System.out.println(priorityQueue);
        priorityQueue.add(5);
        priorityQueue.add(12);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(6);

        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);


        PriorityQueue<String> priorityQueueString = new PriorityQueue<>();
        priorityQueueString.add("ahmed");
        priorityQueueString.add("ahmad");
        System.out.println(priorityQueueString);


        System.out.println("=============================");
        Set<Integer> set = new HashSet<>();
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        A.add(1);
        A.add(2);
        A.add(3);

        B.add(1);
        B.add(2);
        B.add(3);
        B.add(5);


        boolean x  = B.containsAll(A); //
        System.out.println(x);

        set.size();
        A.size();
        queue.size();
        arrayList.size();


        System.out.println("------------------------------------------");

//        <key, value>
        Map<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(123456, "Mohammad");
        hashMap.put(11111, "Lina");
        hashMap.put(12324546, "Esraa");
        System.out.println(hashMap);

        hashMap.remove(11111); // remove lina

        System.out.println(hashMap);

        System.out.println(hashMap.get(12324546));

        hashMap.replace(123456, "reem");
        System.out.println(hashMap);

        hashMap.put(1, "Lina");
        System.out.println(hashMap);



    }
}
