import java.util.Scanner;

public class App1 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("¿Cuántos números deseas ingresar? ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Debe ingresar al menos un número");
            }

            double[] numbers = new double[n];

            // Llenar el arreglo
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese número " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }

            // Mostrar resultados
            System.out.println("\nResultados:");
            System.out.println("Sum: " + FunctionLibrary.sum(numbers));
            System.out.println("Average: " + FunctionLibrary.average(numbers));
            System.out.println("maximo: " + FunctionLibrary.maximo(numbers));
            System.out.println("minimum: " +FunctionLibrary.minimum(numbers));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
