package Controllers;

import View.ConsoleView;
import Models.Contact;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        int option;
        do {
            consoleView.displayMenu();
            try {
                option = Integer.parseInt(consoleView.getInput(""));
                
                switch (option) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        findContact();
                        break;
                    case 3:
                        deleteContact();
                        break;
                    case 4:
                        printContacts();
                        break;
                    case 5:
                        consoleView.showMessage("Saliendo del sistema...");
                        break;
                    default:
                        consoleView.showMessage("Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                consoleView.showMessage("Error: Debe ingresar un número.");
                option = 0;
            }
        } while (option != 5);
    }

    public void addContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto: ");
        String phone = consoleView.getInput("Ingrese el teléfono del contacto: ");
        Contact newContact = new Contact(name, phone);
        contactManager.addContact(newContact);
        consoleView.showMessage("Contacto agregado exitosamente!");
    }

    public void findContact() {
        String name = consoleView.getInput("Ingrese el nombre a buscar: ");
        Contact contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    public void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        boolean deleted = contactManager.deleteContactByName(name);
        if (deleted) {
            consoleView.showMessage("Contacto eliminado exitosamente!");
        } else {
            consoleView.showMessage("No se encontró el contacto para eliminar.");
        }
    }

    public void printContacts() {
        consoleView.showMessage("\n=== LISTA DE CONTACTOS ===");
        contactManager.printList();
    }
}