import java.util.Scanner;

public class PromedioCualitativo {

    public static void main(String[] args) {
        
        double nota1, nota2, nota3, nota4;
        String resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Ingrese la cuarta nota: ");
        nota4 = scanner.nextDouble();

        resultado = calcularPromedioCualitativo(nota1, nota2, nota3, nota4);
        System.out.println("El promedio cualitativo es: " + resultado);

        scanner.close();
    }

    public static String calcularPromedioCualitativo(double nota1, double nota2, double nota3, double nota4) {
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Error en el cálculo del promedio cualitativo";
        }
    }
}
