class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverRide{
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        a.makeSound();         // Calls Dog's method
    }
}
