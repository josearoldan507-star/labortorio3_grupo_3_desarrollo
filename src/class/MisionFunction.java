import java.util.Scanner;

public class MisionFunction {

    // Crear lista de misiones
    public Mission[] crearMisiones() {
        Mission[] misiones = new Mission[3];

        misiones[0] = new Mission(1, "Encontrar la Llave", "Fácil", "Pendiente");
        misiones[1] = new Mission(2, "Rescatar al Perro", "Media", "Pendiente");
        misiones[2] = new Mission(3, "Derrotar al Dragón", "Difícil", "Pendiente");

        return misiones;
    }

    // Listar misiones
    public void listarMisiones(Mission[] misiones) {
        for (Mission m : misiones) {
            m.mostrar();
        }
    }

    // Cambiar estado de misión
    public void cambiarEstado(Mission[] misiones, Scanner input) {
        try {
            input.nextLine(); // limpiar buffer antes
            System.out.print("Ingrese ID de la misión: ");
            int id = input.nextInt();
            input.nextLine(); // ✅ LIMPIAR buffer después del nextInt()

            boolean encontrada = false;

            for (Mission m : misiones) {
                if (m.getId() == id) {
                    System.out.print("Nuevo estado: ");
                    String nuevoEstado = input.nextLine(); // ahora sí funciona
                    m.setStatus(nuevoEstado);
                    System.out.println(" Estado actualizado.");
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                System.out.println(" Misión no encontrada.");
            }

        } catch (Exception e) {
            System.out.println(" Error: entrada inválida.");
            input.nextLine(); // limpiar buffer
        }
    }
}