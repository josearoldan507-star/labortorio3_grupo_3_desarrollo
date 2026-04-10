import java.util.Scanner;

public class Proyecto3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iniciando sistema de agenda del gremio...");

        String[] nombres = new String[5];
        int[] rangos = new int[5];
        int contador = 0;

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar miembro");
            System.out.println("2. Listar miembros");
            System.out.println("3. Buscar miembro");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

                        if (opcion == 1) {
                System.out.println("Seleccionaste agregar miembro...");

                if (contador < nombres.length) {
                    System.out.print("Ingresa el nombre: ");
                    nombres[contador] = sc.nextLine();

                    System.out.print("Ingresa el rango (numero): ");
                    rangos[contador] = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Miembro agregado correctamente.");
                    contador++;
                } else {
                    System.out.println("No se pueden agregar más miembros, arreglo lleno.");
                }

                            } else if (opcion == 2) {
                System.out.println("Mostrando lista de miembros...");

                if (contador == 0) {
                    System.out.println("No hay miembros registrados.");
                } else {
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Posicion " + i + 
                            " -> Nombre: " + nombres[i] + 
                            " | Rango: " + rangos[i]);
                    }
                }

                            } else if (opcion == 3) {
                System.out.print("Ingresa el nombre a buscar: ");
                String buscar = sc.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < contador; i++) {
                    if (nombres[i].equalsIgnoreCase(buscar)) {
                        System.out.println("Miembro encontrado:");
                        System.out.println("Nombre: " + nombres[i]);
                        System.out.println("Rango: " + rangos[i]);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("No se encontró el miembro.");
                }

                            } else if (opcion == 4) {
                System.out.println("Saliendo del sistema...");

            } else {
                System.out.println("Opcion invalida, intenta de nuevo.");
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
