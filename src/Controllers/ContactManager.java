package Controllers;

import Models.Contact;
import Models.LinkedList;
import Models.Node;

public class ContactManager {
    private LinkedList<Contact> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }

    public Contact findContactByName(String name) {
        Node<Contact> current = contacts.getHead();
        while (current != null) {
            if(current.getValue() != null && name.equalsIgnoreCase(current.getValue().getName())) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Contact contactToDelete = findContactByName(name);
        if (contactToDelete != null) {
            contacts.deleteByValue(contactToDelete);
            return true;
        }
        return false;
    }

    public void printList() {
        Node<Contact> current  = contacts.getHead();
        if(current == null) {
            System.out.println("No hay contacto registrados");
            return;
        }
        System.out.println("\n=== Contactos Registrados ===");
        while(current != null) {
            if(current.getValue() != null) {
                System.out.println(current.getValue());
            }
            current = current.getNext();
        }
        System.out.println("============================");
    }
}