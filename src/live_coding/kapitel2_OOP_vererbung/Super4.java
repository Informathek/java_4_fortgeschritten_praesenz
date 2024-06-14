package live_coding.kapitel2_OOP_vererbung;
/* Super
* 1. Mit Variablen
* 2. Mit Methoden
* 3. Mit Konstruktoren
* */


class Fahrzeug{
    int maxSpeed = 60;
    String name = "Reem";

    Fahrzeug(){
        System.out.println("Das ist ein leeres Konstruktor von Fahrzeug." + this.maxSpeed + " " + this.name);
    }

    Fahrzeug(String name){
        this.name = name;
        System.out.println("Das ist Konstruktor mit 1 params von Fahrzeug." + this.maxSpeed + " " + this.name);
    }

    Fahrzeug(int maxSpeed, String name){
        this.maxSpeed = maxSpeed;
        this.name = name;
        System.out.println("Das ist Konstruktor mit 2 params von Fahrzeug." + this.maxSpeed + " " + this.name);
    }

    void message(){
        System.out.println("Das ist die Fahrzeug-klasse");
    }

}

class Pkw extends Fahrzeug{
    int maxSpeed = 180;

    Pkw(){
        System.out.println("Das ist ein leeres Konstruktor von Pkw." + this.maxSpeed + " " + this.name);
    }

    Pkw(int maxSpeed){
        super();
        this.maxSpeed = maxSpeed;
        System.out.println("Das ist ein Konstruktor mit einem Param von Pkw." + this.maxSpeed + " " + this.name);
    }

    Pkw(int maxSpeed, String name){
        super(name);
        this.maxSpeed = maxSpeed;
        System.out.println("Das ist ein Konstruktor mit einem Param von Pkw." + this.maxSpeed + " " + this.name);
    }

    void message(){
        System.out.println("Das ist die Pkw-klasse");
    }

    void display(){
//        System.out.println(maxSpeed); // shortcut. aehnlich wie mit this.maxSpeed
//        System.out.println(this.maxSpeed); // this. ist ueberfluessig
//        System.out.println(super.maxSpeed); // 60
//        System.out.println(super.name); // reem

//        message(); // shortcut. aehnlich wie mit this.maxSpeed
//        this.message(); // this. ist ueberfluessig
//        super.message();
    }

}

public class Super4 {
    public static void main(String[] args) {
        Fahrzeug fahrzeug1 = new Fahrzeug();
        Fahrzeug fahrzeug2 = new Fahrzeug(250, "mercedes");

        Pkw pkw0 = new Pkw(); // maxSpeed = 180, (name ist reem)
        Pkw pkw1 = new Pkw(200, "VW"); //maxSpeed = 200, (name ist  VW)
        Pkw pkw2 = new Pkw(300); //maxSpeed = 300, (name ist reem)

//        System.out.println(pkw1.maxSpeed); // 180
//
//        System.out.println("-----------");
//
//        pkw0.display(); // 180, 180, 60. reem
//        System.out.println("***");
//
//        pkw1.display(); // 200, 200, 60, reem
//        System.out.println("***");
//
//        pkw2.display(); // 300, 300, 60, reem

    }
}
