package live_coding.kapitel5_snacks;

import java.util.Random;

//class Cat{
//    int alter;
//    int returnNummer(){
//        return 5;
//    }
//}

public class Random_2 {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        int x = cat.returnNummer();
//        System.out.println(x);

        Random random = new Random();


        int randomInt = random.nextInt(41, 59);
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        System.out.println('\u0076');
    }
}
