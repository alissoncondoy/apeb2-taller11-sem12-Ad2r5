import java.util.Scanner;
public class CalculadoraAreas {

    public static void main(String[] args) {
         int opcion;
        System.out.println("[1] Calcular el área de un triángulo");
        System.out.println("[2] Calcular el área de un cuadrado");
        System.out.println("[3] Calcular el área de un rectángulo");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la base del triángulo: ");
             double n1 = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
             double n2 = scanner.nextDouble();
                System.out.println("El área del triángulo es: " + areaTriangulo(n1, n2));
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                n1 = scanner.nextDouble();
                System.out.println("El área del cuadrado es: " + areaCuadrado(n1));
                break;
            case 3:
                System.out.print("Ingrese la base del rectángulo: ");
                n1 = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                n2 = scanner.nextDouble();
                System.out.println("El área del rectángulo es: " + areaRectangulo(n1, n2));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
}
