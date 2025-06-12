import Controllers.ContactManager;
import Controllers.MenuController;
import Models.Contact;
import View.ConsoleView;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== AGENDA DE CONTACTOS ===");
        ContactManager manager = new ContactManager();
        manager.addContact(new Contact("Pablo", "12345"));
        manager.addContact(new Contact("María", "67890"));
        manager.addContact(new Contact("Doménica", "1357"));
        manager.addContact(new Contact("Brandon", "08715"));
        manager.addContact(new Contact("Carlos", "16231"));
        ConsoleView consoleView = new ConsoleView();
        MenuController menuController = new MenuController(manager, consoleView);
        menuController.showMenu();
    }
}
