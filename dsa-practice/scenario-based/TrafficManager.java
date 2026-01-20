import java.util.*;
// Vehicle node (Circular Linked List)
class Vehicle {
    int id;
    Vehicle next;

    Vehicle(int id) {
        this.id = id;
        this.next = null;
    }
}
// Roundabout
class Roundabout {
    private Vehicle head = null;

    // Add vehicle in circular path
    public void addVehicle(int id) {
        Vehicle newVehicle = new Vehicle(id);
        if (head == null) {
            head = newVehicle;
            head.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        System.out.println("Vehicle " + id + " entered roundabout");
    }

    // Remove vehicle from roundabout
    public void removeVehicle(int id) {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle curr=head,prev=null;
        do {
            if (curr.id == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        prev = head;
                        while (prev.next != head) {
                            prev = prev.next;
                        }
                        head = head.next;
                        prev.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println("Vehicle " + id + " exited roundabout");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }
    // Print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.id + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
// Queue for waiting vehicles
class VehicleQueue {
    private int[] queue;
    private int front=0,rear=-1,size=0;
    private int capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    // Enqueue with overflow check
    public void enqueue(int id) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Vehicle " + id + " cannot wait");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = id;
        size++;
        System.out.println("Vehicle " + id + " added to waiting queue");
    }
    // Dequeue with underflow check
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! No vehicle waiting");
            return -1;
        }
        int id = queue[front];
        front = (front + 1) % capacity;
        size--;
        return id;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
public class TrafficManager {
    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(3);

        // Vehicles arrive
        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);
        queue.enqueue(104); // overflow

        // Vehicles enter roundabout
        while (!queue.isEmpty()) {
            int vehicle = queue.dequeue();
            roundabout.addVehicle(vehicle);
        }

        roundabout.printRoundabout();
        // Vehicles exit
        roundabout.removeVehicle(102);
        roundabout.printRoundabout();

        roundabout.removeVehicle(101);
        roundabout.removeVehicle(103);
        roundabout.printRoundabout();
    }
}
