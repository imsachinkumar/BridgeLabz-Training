import java.util.ArrayList;
import java.util.List;
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
class Contact {
    private String name;
    private String phoneNumber;
    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    // Getter methods
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
class ContactOrganizer {
    // List to store contacts
    private List<Contact> contacts = new ArrayList<>();
    public void addContact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        // Phone number must be exactly 10 digits
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number! Must be exactly 10 digits.");
        }
        // Prevent duplicate phone numbers
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("Contact added successfully.");
    }
    public void deleteContact(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(c);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    public void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                System.out.println("Name : " + c.getName());
                System.out.println("Phone: " + c.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
public class PhoneContactOrganizerApp {
    public static void main(String[] args) {
    //Creating Object
        ContactOrganizer organizer = new ContactOrganizer();
        try {
            organizer.addContact("Amit", "9876543210");
            organizer.addContact("Riya", "9123456789");
            // Invalid phone number example
            organizer.addContact("John", "12345");
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
        organizer.searchContact("Amit");
        // Delete contact
        organizer.deleteContact("9876543210");
        // Search again after deletion
        organizer.searchContact("Amit");
    }
}
