package live_coding.kapitel5_snacks;

public class ForEach_8 {
    public static void main(String[] args) {
        int[] arr = {7,3,9,2,0};

        for (int i = 0; i < arr.length; i++)  {
            System.out.println(arr[i]);
        }

        System.out.println("----");

        for (int value: arr){
            System.out.println(value);
        }


        String[] namenArr = {"esraa", "reem"};
        for (String name: namenArr){ // for each
            System.out.println(name);
            break;
        }
    }
}
