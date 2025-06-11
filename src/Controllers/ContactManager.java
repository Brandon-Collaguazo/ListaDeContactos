package Controllers;
import Models.LinkedList;
import Models.Contact;
import Models.Node;
import View.ConsoleView;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        Node<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            String contactName = (String) current.getValue().getName();
            if (contactName.equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Node<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            String contactName = (String) current.getValue().getName();
            if (contactName.equalsIgnoreCase(name)) {
                return contacts.deleteByValue(current.getValue());
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        contacts.print();
    }
}
