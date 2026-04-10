import java.util.Scanner;

public class LoginFunction {

    String[] nombres = new String[10];
    int[] rangos = new int[10];
    int contador = 0;

    public void menu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- AGENDA DEL GREMIO ---");
            System.out.println("1. Agregar miembro");
            System.out.println("2. Listar miembros");
            System.out.println("3. Buscar miembro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (contador < nombres.length) {
                        System.out.print("Ingrese nombre: ");
                        nombres[contador] = sc.nextLine();

                        System.out.print("Ingrese rango: ");
                        rangos[contador] = sc.nextInt();
                        sc.nextLine();

                        contador++;
                        System.out.println("Miembro agregado.");
                    } else {
                        System.out.println("Error: Agenda llena.");
                    }
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("No hay miembros.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + nombres[i] + " - Rango: " + rangos[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contador; i++) {
                        if (nombres[i].equalsIgnoreCase(buscar)) {
                            System.out.println("Encontrado: " + nombres[i] + " - Rango: " + rangos[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error: Opción inválida (1-4).");
            }

        } while (opcion != 4);
    }
}