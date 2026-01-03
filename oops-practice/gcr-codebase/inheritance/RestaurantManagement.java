// Superclass
class Person {
    String name;
    int id;
    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
// Interface
interface Worker {
    void performDuties(); // abstract method
}
// Chef class (Hybrid Inheritance)
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    // Implementation of interface method
    public void performDuties() {
        System.out.println("Chef prepares and cooks food");
    }
}
// Waiter class (Hybrid Inheritance)
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter serves food to customers");
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        //Creating Object
        Worker c = new Chef("Ramesh", 101);
        Worker w = new Waiter("Suresh", 102);
        c.performDuties();
        w.performDuties();
    }
}
