package live_coding.kapitel1_OOP_grundlagen;

public class Arrays_vereinfacht_5 {
    public static void main(String[] args) {

        int x;
        x = 6;

        boolean boolVariable = true;
        boolean[] boolArray = {true, false, false, true};

        System.out.println(boolVariable);

        System.out.println(boolArray[0]);
        System.out.println(boolArray[1]);
        System.out.println(boolArray[2]);
        System.out.println(boolArray[3]);

        boolArray[0] = false;
        boolArray[1] = true;
        boolArray[2] = false;
        boolArray[3] = false;

    }
}
