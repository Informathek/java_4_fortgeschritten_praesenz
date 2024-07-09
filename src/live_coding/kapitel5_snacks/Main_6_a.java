package live_coding.kapitel5_snacks;


class Katze{
    int alter;
    String name;

    static int findeMinimum(int[] arr){

        int max_bis_jetzt =  arr[0];

        for (int i = 0; i < arr.length; i++){
            if(max_bis_jetzt < arr[i]){
                max_bis_jetzt = arr[i]; // update den maximalen wert, den ich bis jetzt gefunden habe.
            }
        }

        return max_bis_jetzt;
    }
}


public class Main_6_a {
    static int findeMaximum(int[] arr){

        int max_bis_jetzt =  arr[0];

        for (int i = 0; i < arr.length; i++){
            if(max_bis_jetzt < arr[i]){
                max_bis_jetzt = arr[i]; // update den maximalen wert, den ich bis jetzt gefunden habe.
            }
        }
        return max_bis_jetzt;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
