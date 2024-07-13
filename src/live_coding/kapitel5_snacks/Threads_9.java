package live_coding.kapitel5_snacks;

class Pos implements Runnable{
    int alter;
    public void run() {
        System.out.println("+1");
        System.out.println("+2");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("+3");
        System.out.println("+4");
    }

    void printSoemthign(){

    }

}


class Neg implements Runnable{
    public void run(){
        System.out.println("-1");
        System.out.println("-2");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("-3");
        System.out.println("-4");
    }
}
public class Threads_9 {

    public static void main(String[] args) {
        System.out.println("Hello");

        Pos pos = new Pos();
        Thread thread1 = new Thread(pos);
        thread1.start();

        System.out.println("Mitte");

        new Thread(new Neg()).start();


        System.out.println("Bye");

    }
}
