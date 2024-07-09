package live_coding.kapitel5_snacks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class OutputStream_4 {
    public static void main(String[] args) throws IOException {
        String myString = "1 4 6 8 45  67    678    435 aaaaaaaaa bbbbbb"; // 14 buchstaben

        OutputStream output = new FileOutputStream("reem.txt");

//        byte[] arr = myString.getBytes();
        output.write(myString.getBytes());
        output.close();
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
//        scanner.close();
//
//        Random random = new Random();
//        random.nextFloat();

    }
}
