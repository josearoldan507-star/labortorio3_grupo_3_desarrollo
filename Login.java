import java.util.Scanner;

public class Login {

    private final String USER = "Yona";
    private final String PASS = "1234";

    public boolean iniciarSesion() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--- LOGIN ---");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String password = sc.nextLine();

            if (usuario.equals(USER) && password.equals(PASS)) {
                System.out.println("Acceso concedido.\n");
                return true;
            } else {
                System.out.println("Usuario o contraseña incorrectos.\n");
                return false;
            }
        }
    }
}