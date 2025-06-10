package Controllers;

import Models.Contact;
import View.ConsoleView;

public class ContactManager {
    public class ContactManager {
        private LinkedList<Contact<?, ?>> contacts;

        public ContactManager() {
            contacts = new LinkedList<>();
        }

        public void addContact(Contact<?, ?> contact) {
            contacts.appendToTail(contact);
        }

        public Contact<?, ?> findContactByName(String name) {
            Node<Contact<?, ?>> current = contacts.head;
            while (current != null) {
                if (current.getValue().getName().toString().equalsIgnoreCase(name))
                    return current.getValue();
                current = current.getNext();
            }
            return null;
        }

        public boolean deleteContactByName(String name) {
            Node<Contact<?, ?>> current = contacts.head;
            while (current != null) {
                if (current.getValue().getName().toString().equalsIgnoreCase(name)) {
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





}
