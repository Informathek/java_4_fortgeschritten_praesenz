package live_coding.kapitel5_snacks;

import java.util.Scanner;

public class Input_3 {
    public static void main(String[] args) {
        System.out.println("Hi");

        Scanner scanner = new Scanner(System.in);
//        int username = scanner.nextInt();
//        System.out.println(username);

        String password = scanner.nextLine();
        System.out.println(password);
        System.out.println("Bye");
    }
}
