import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Login login = new Login();
        boolean acceso = login.iniciarSesion();

        if (acceso) {
            LoginFunction agenda = new LoginFunction();
            agenda.menu();
        } else {
            System.out.println("Acceso denegado.");
        }

        sc.close(); 
    }
}