package live_coding.kapitel5_snacks;



import java.io.*;

public class _OutputStream_1 {

    public static void main(String[] args) throws IOException {
        String data = "123";

        OutputStream out = new FileOutputStream("output1.txt");
        InputStream input = new FileInputStream("output.txt");

        byte[] dataByte1 = data.getBytes();
        byte[] dataByte2 = new byte[100];

        out.write(dataByte1);
        input.read(dataByte2);

        String dataByte2_str = new String(dataByte2);
        System.out.println(dataByte2_str.substring(0));



    }
}
