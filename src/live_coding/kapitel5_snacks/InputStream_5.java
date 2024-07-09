package live_coding.kapitel5_snacks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStream_5 {
    public static void main(String[] args) throws IOException {

        InputStream input = new FileInputStream("reem.txt");
//        byte[] arr = new byte[15];
        byte[] arr1 = input.readAllBytes();

        input.read(arr1);

        input.close();

//        System.out.println(arr[1]);
        String myString = new String(arr1);
        System.out.println(myString);

    }
}
