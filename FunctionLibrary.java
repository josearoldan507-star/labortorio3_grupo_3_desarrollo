public class FunctionLibrary{

    // Método para sumar todos los elementos
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Método para calcular el promedio
    public static double average(double[] numbers) {
        if (numbers.length == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return sum(numbers) / numbers.length;
    }

    // Método para encontrar el número máximo
    public static double maximo(double[] numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Método para encontrar el número mínimo
    public static double minimum(double[] numbers) {
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}  
