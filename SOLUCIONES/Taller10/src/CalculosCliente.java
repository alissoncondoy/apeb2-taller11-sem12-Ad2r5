import java.util.Scanner;

public class CalculosCliente {
    
    public static void main(String[] args) {
        int opcion;
        String nombreCliente, cedulaCliente;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();

        System.out.print("Ingrese la cédula del cliente: ");
        cedulaCliente = scanner.nextLine();

        System.out.println("[1] Calcular valor de la planilla de luz");
        System.out.println("[2] Calcular valor del predio de un bien inmueble");

        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularValorLuz(nombreCliente, cedulaCliente, scanner);
                break;
            case 2:
                calcularPredio(nombreCliente, cedulaCliente, scanner);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void calcularValorLuz(String nombreCliente, String cedulaCliente, Scanner scanner) {
        System.out.print("Ingrese el valor del kilowatio: ");
        double valorKilowatio = scanner.nextDouble();

        System.out.print("Ingrese el número de kilowatios del mes: ");
        double numeroKilowatios = scanner.nextDouble();

        double totalPagar = valorKilowatio * numeroKilowatios;

        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente + " debe cancelar el valor de $" + totalPagar);
    }

    public static void calcularPredio(String nombreCliente, String cedulaCliente, Scanner scanner) {
        System.out.print("Ingrese el valor del inmueble: ");
        double valorInmueble = scanner.nextDouble();

        double valorPredio = 0.02 * valorInmueble;

        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente + " tiene un bien inmueble valorado en $" + valorInmueble +
                " y tiene que pagar de predio $" + valorPredio);
    }
}
