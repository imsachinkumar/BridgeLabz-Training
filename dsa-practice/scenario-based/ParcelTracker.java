// Singly Linked List Node
class Stage {
    String name;
    Stage next;

    Stage(String name) {
        this.name = name;
        this.next = null;
    }
}

// Parcel Tracker using Singly Linked List
class Parcel {
    private Stage head;
    // Initialize default stages
    public Parcel() {
        head = new Stage("Packed");
        head.next = new Stage("Shipped");
        head.next.next = new Stage("In Transit");
        head.next.next.next = new Stage("Delivered");
    }

    // Forward tracking through stages
    public void trackParcel() {
        Stage temp = head;

        if (temp == null) {
            System.out.println("Parcel lost: no tracking data");
            return;
        }

        System.out.print("Parcel Status: ");
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add custom checkpoint after a stage
    public void addCheckpoint(String afterStage, String newStage) {
        Stage temp = head;

        while (temp != null) {
            if (temp.name.equals(afterStage)) {
                Stage node = new Stage(newStage);
                node.next = temp.next;
                temp.next = node;
                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found: " + afterStage);
    }
    //missing parcel (null pointer)
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST");
    }
}
public class ParcelTracker {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.trackParcel();

        parcel.addCheckpoint("Shipped", "At Warehouse");
        parcel.trackParcel();

        parcel.markParcelLost();
        parcel.trackParcel();
    }
}
