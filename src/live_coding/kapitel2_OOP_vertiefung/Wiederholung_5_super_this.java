package live_coding.kapitel2_OOP_vertiefung;
/*
* Agenda:
*
* 1. this:
* ========
*   a) verweist auf aktuelle class variablen
*   b) verweist auf aktuelle class methoden
*   c) ruft andere class konstruktoren der selben Klasse
*
* 2. super:
* =========
*   a) verweist auf super class variables
*   b) verweist auf super class methods
*   c) ruft super class konstruktoren
*
* 3. final keyword
* 4. abstract keyword
* 5. access modifiers (public, private, protected)
* 6. Encapsulation: getters & setters
* */

// Rundklammer: ()
// Eckigeklammer: []
// Schweifkammer: {}
// Geschweifte Klammer: {}



class Animal1{
    // class variable
    String rasse = "NICHTS";

    // class methode
    void makeSound(){
        System.out.println("Animal makes sounds");
    }

    // 1. Konstruktor: ruft die zweite Konstrkuror auf
    Animal1(){
        this("KEINE");
        // this.rasse = "KEINE";
        System.out.println("Das ist die 1. Animal konstrktor -- Ohne Parameters");
    }

    // 2. Konstruktor
    Animal1(String rasse){
        this.rasse = rasse;
        System.out.println("Das ist die 2. Animal konstrktor -- Mit Parameter");
    }
}

class Cat extends Animal1{
    String name;

    // Polymorphismus == mehrform: Man ueberschreibt die uebere Variable,die in verschieden Klassen benutzt wird
    void makeSound(){
        System.out.println("Cat makes sounds");
    }

    Cat(){
        // IMMAER (per default, egal ob ich super schreibe oder nicht):
        // jeder sub-konstrkutor (naemlich Cat() oder auch Cat(String name) ruft den "leeren"
        // super-Konstruktor (naemlich Animal()) auf.
//        super(); // // wird automatisch aufgerufen per default
        System.out.println("Das ist die 1. Cat konstrktor -- Ohne Parameters");
    }

    // Overloading == die mehtoden sollen sich entweder in dem Namen aendern, oder anzahl Parameters oder Datentype der Parameters
    Cat(String name){
        // super();
        this.name = name;
        System.out.println("Das ist die 2. Cat konstrktor -- Ein Parameters");
    }

    Cat(String name, String rasse){
        // super();
//        super.rasse = rasse;
        super(rasse);
        this.name = name;
        System.out.println("Das ist die 2. Cat konstrktor -- Ein Parameters");
    }

    void display(){
        System.out.println(this.name);
        System.out.println(super.rasse);
        this.makeSound();
        super.makeSound();
    }
}


public class Wiederholung_5_super_this {
    public static void main(String[] args) {

//        Animal1 animal1 = new Animal1();
//        System.out.println(animal1.rasse);
//        animal1.makeSound();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Luna");
        Cat cat3 = new Cat("Luna", "BKH");
        System.out.println(cat3.rasse);
        cat3.makeSound();

    }
}
