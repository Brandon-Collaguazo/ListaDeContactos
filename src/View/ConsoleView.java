package View;

import java.util.Scanner;

public class ConsoleView {
    private Scanner sc;

    public ConsoleView() {
        this.sc = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("===Menú===");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Mostrar contactos");
        System.out.println("5. Salir");
        System.out.println("Selecciona un opción: ");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
    
}
