package taller10;
import java.util.Arrays;
public class Taller10 {
    public static void imprimirPares(int[][] arreglo) {
        System.out.println("Valores pares:");
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                if (elemento % 2 == 0) {
                    System.out.print(elemento + " ");
                }
            }
        }
        System.out.println(); 
    }
    public static void imprimirImpares(int[][] arreglo) {
        System.out.println("Valores impares:");
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                if (elemento % 2 != 0) {
                    System.out.print(elemento + " ");
                }
            }
        }
        System.out.println(); 
    }
    public static void calcularYImprimirPromedio(int[][] arreglo) {
        int total = 0;
        int elementos = 0;
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                total += elemento;
                elementos++;
            }
        }
        double promedio = (double) total / elementos;
        System.out.println("El promedio es: " + promedio);
    }

    public static void main(String[] args) {

        int[][] miArreglo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        imprimirPares(miArreglo);
        imprimirImpares(miArreglo);
        calcularYImprimirPromedio(miArreglo);
    }
}
