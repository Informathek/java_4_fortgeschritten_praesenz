package live_coding;

// Exception handling = Fehler behandlun

import java.util.Scanner;

public class kapitel5_snacks {
    public static void main(String[] args) {
//        int alter = 11;
//        if (alter > 10){
//            System.out.println("du drfst ins kino");
//        }
//        else{
//            System.out.println("Du darfts nicht ins Kino");
//        }

        Scanner scanner = new Scanner(System.in);
        int dieGroesseDesArrays = 0;
        try{
            dieGroesseDesArrays = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Falsche Eingabe, bitte integer werte angeben. diese zahl wird fier die geosse des artrays benutzt");
        }

        System.out.println("Hi");

        int x = 10;
        int y = 0;
        int ergebnis = 0;

        int[] arr = new int[dieGroesseDesArrays];

        try{
            ergebnis = x / y;
            System.out.println(arr[100]);
        }
        catch (Exception e){
            System.out.println("Heeey, du darfst nicht durch 0 devividieren. Versuche nochmal");
            System.out.println("pech gehabt. der code wird aber trotzdem nicht unterbreechen, es geht weiter....");
//            y = 1;
//            ergebnis = x / y;
        }
        finally {
            System.out.println("versuche noch mal");
        }

//        System.out.println(ergebnis);


        System.out.println("Good bye");

    }
}
