class Animal {
    int age = 10;  // Direct initialization
}

class Dog extends Animal {}

class Tier {
    int alter;
}

class Hund extends Tier {}


public class Vererbung_2 {
    public static void main(String[] args) {
        // Create instances of Animal and Tier
        Animal animal = new Animal();
        Tier tier = new Tier();

        // Assign values to age and alter
        animal.age = 20;
        tier.alter = 30;

        // Create instances of Dog and Hund
        Dog dog = new Dog();
        Hund hund = new Hund();

        // Display the age of Dog instance
        System.out.println("Age of Dog: " + dog.age);  // Output: 10

        // Display the alter of Hund instance
        System.out.println("Alter of Hund: " + hund.alter);  // Output: 0

        // Set values to Dog and Hund
        dog.age = 25;
        hund.alter = 35;

        // Display the new values
        System.out.println("New Age of Dog: " + dog.age);  // Output: 25
        System.out.println("New Alter of Hund: " + hund.alter);  // Output: 35
    }
}
