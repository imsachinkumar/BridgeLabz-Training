// Superclass
class Animal {
    String name;
    int age;
    // Constructor to initialize data
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}
// Subclass Dog
class Dog extends Animal {
    // Constructor using super keyword
    Dog(String name, int age) {
        super(name, age);
    }
    // Overriding makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " says Woof Woof");
    }
}
// Subclass Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says Meow Meow");
    }
}
// Subclass Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says Chirp Chirp");
    }
}
public class AnimalHierarchy{
    public static void main(String[] args) {
        // Polymorphism
        Animal a1=new Dog("Rocky", 3);
        Animal a2=new Cat("Kitty", 2);
        Animal a3=new Bird("Tweety", 1);
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
