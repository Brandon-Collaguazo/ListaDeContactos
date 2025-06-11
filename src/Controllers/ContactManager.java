package Controllers;

import Models.Contact;
import Models.LinkedList;
import Models.Node;

public class ContactManager {
    private LinkedList<Contact<String, String>> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
        Node<Contact<String, String>> current = contacts.getHead();
        while (current != null) {
            if (current.getValue().getName().equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Contact<String, String> contactToDelete = findContactByName(name);
        if (contactToDelete != null) {
            contacts.deleteByValue(contactToDelete);
            return true;
        }
        return false;
    }

    public void printList() {
        contacts.print();
    }
}