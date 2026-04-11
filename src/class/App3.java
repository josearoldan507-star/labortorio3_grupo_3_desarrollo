import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Datos que ingresa el usuario
        System.out.print("Ingrese usuario: ");
        String userInput = sc.nextLine();

        System.out.print("Ingrese contraseña: ");
        String passInput = sc.nextLine();

        // Crear objeto con los datos correctos (los del sistema)
        Login login = new Login("admin", "123456");

        // Validar login
        if (login.validateLogin(userInput, passInput)) {
            System.out.println(" Login correcto");
            login.showInfo();
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }

        sc.close();
    }
}