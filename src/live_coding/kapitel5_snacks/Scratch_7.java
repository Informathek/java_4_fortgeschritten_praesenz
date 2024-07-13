package live_coding.kapitel5_snacks;

public class Scratch_7 {
    public static void main(String[] args) {
        System.out.println("main_1");

        ASystem aSystem = new ASystem();
        aSystem.run();

        System.out.println("main_3");

        AnotherSystem anotherSystem = new AnotherSystem();
        anotherSystem.run();

        System.out.println("main_4");
    }
}


class ASystem {

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("+1");
        System.out.println("+2");
        System.out.println("+3");
        System.out.println("+4");
//        System.out.println("+5");
//        System.out.println("+6");
//        System.out.println("+7");
//        System.out.println("+8");
//        System.out.println("+9");
//        System.out.println("+10");
    }
}

class AnotherSystem{
    public void run() {
        System.out.println("-1");
        System.out.println("-2");
        System.out.println("-3");
        System.out.println("-4");
//        System.out.println("-5");
//        System.out.println("-6");
//        System.out.println("-7");
//        System.out.println("-8");
//        System.out.println("-9");
//        System.out.println("-10");
    }
}


//class Scratch_7 {
//    public static void main(String[] args) {
//        System.out.println("main_1");
//        System.out.println("mainb_2");
//
//        ASystem aSystem = new ASystem();
//        Thread thread1 = new Thread(aSystem); // Creating thread for ASystem
//        thread1.start(); // Starting thread1
//
//        System.out.println("main_3");
//
//        AnotherSystem anotherSystem = new AnotherSystem();
//        Thread thread2 = new Thread(anotherSystem); // Creating thread for AnotherSystem
//        thread2.start(); // Starting thread2
//
//        System.out.println("main_4");
//    }
//}
//
//class ASystem implements Runnable {
//    public void run() {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("+1");
//        System.out.println("+2");
//        System.out.println("+3");
//        System.out.println("+4");
////        System.out.println("+5");
////        System.out.println("+6");
////        System.out.println("+7");
////        System.out.println("+8");
////        System.out.println("+9");
////        System.out.println("+10");
//    }
//}
//
//class AnotherSystem implements Runnable {
//    public void run() {
//        System.out.println("-1");
//        System.out.println("-2");
//        System.out.println("-3");
//        System.out.println("-4");
////        System.out.println("-5");
////        System.out.println("-6");
////        System.out.println("-7");
////        System.out.println("-8");
////        System.out.println("-9");
////        System.out.println("-10");
//    }
//}


//
//class ASystem {
//    public static void count() {
//        System.out.println("+1");
//        System.out.println("+2");
//        System.out.println("+3");
//        System.out.println("+4");
//    }
//}
//
//class AnotherSystem {
//    public static void count() {
//        System.out.println("-1");
//        System.out.println("-2");
//        System.out.println("-3");
//        System.out.println("-4");
//    }
//}
//
//
//public class Scratch_7 {
//        public static void main(String[] args) {
//            System.out.println("1");
//            System.out.println("2");
//            new Thread(() -> ASystem.count()).start();
//            System.out.println("3");
//            new Thread(() -> AnotherSystem.count()).start();
//            System.out.println("4");
//        }
//}
