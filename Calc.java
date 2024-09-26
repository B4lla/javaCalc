import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un nº: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce un segundo nº: ");
        double num2 = scanner.nextDouble();

        System.out.println("Selecciona que operacion: ");
        System.out.println("1: Suma (+)");
        System.out.println("2: Resta (-)");
        System.out.println("3: Multiplicación (*)");
        System.out.println("4: División (/)");

        int operacion = scanner.nextInt();

        double resultado;

        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        scanner.close();
    }
}
