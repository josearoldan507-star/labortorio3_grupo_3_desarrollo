import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ✔ Nombre correcto de la clase
        MisionFunction manager = new MisionFunction();

        // ✔ Método correcto
        Mission[] missions = manager.crearMisiones();

        int option;

        do {
            System.out.println("\n==== MENÚ DEL GESTOR DE MISIONES ====");
            System.out.println("1. Listar todas las misiones");
            System.out.println("2. Completar una misión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            option = input.nextInt();
            input.nextLine(); // limpiar buffer

            switch (option) {

                case 1:
                    // ✔ Método correcto
                    manager.listarMisiones(missions); 
                    break;

                case 2:
                    manager.cambiarEstado(missions, input);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (option != 3);

        input.close();
    }
}