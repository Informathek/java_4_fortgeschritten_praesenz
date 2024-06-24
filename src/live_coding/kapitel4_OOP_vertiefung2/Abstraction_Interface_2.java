package live_coding.kapitel4_OOP_vertiefung2;

// Agenda:
// DONE: 1. Listen motivation
// Done: 2. Objekt Class
// Done: 3. abstract / interface
// 4. arrays
// 5. String / new String / String methods
// 6. wrapper class allgemein
// 7. interger Class
// 8. collection framework

//abstract class Auto{
//    abstract void printMe();
//    abstract void printYou();
//    void printEsraa(){
//        System.out.println("this is my bmw");
//    }
//}
//
//class Bmw extends Auto{
//    void printMe(){
//        System.out.println("this is my bmw");
//    }
//    void printYou(){
//        System.out.println("this your bmw");
//    }
//}
//
//class Volvo extends Auto{
//    void printMe(){
//        System.out.println("this is my volvo");
//    }
//    void printYou(){
//        System.out.println("this is your volvo");
//    }
//}


interface Auto{
    void printMe();
    void printYou();
}

class Bmw implements Auto{
    public void printMe(){
        System.out.println("this is my bmw");
    }
    public void printYou(){
        System.out.println("this your bmw");
    }
}

class Volvo implements Auto{
    public void printMe(){
        System.out.println("this is my volvo");
    }
    public void printYou(){
        System.out.println("this is your volvo");
    }
}







public class Abstraction_Interface_2 {
    public static void main(String[] args) {
//        Auto myAuto = new Auto();
//        System.out.println(myAuto.toString());

        Bmw myBmw = new Bmw();
        Volvo myVolvo = new Volvo();

        myBmw.printMe();
        myBmw.printYou();
        myVolvo.printMe();
        myVolvo.printYou();
    }
}

// Collection
// List
// ArrayList , LinkedList