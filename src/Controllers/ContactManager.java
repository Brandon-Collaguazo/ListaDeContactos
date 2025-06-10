package Controllers;

<<<<<<< HEAD
import Models.LinkedList;
=======
import Models.Contact;
import View.ConsoleView;
>>>>>>> 0a3c35352f9f3ae49ad31161f9edca0dd6396207

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
