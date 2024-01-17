
public class OperacionesArregloCuadrado {

    public static int sumaArregloCuadrado(int[][] arreglo) {
        int suma = 0;
        int filas = arreglo.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                suma += arreglo[i][j];
            }
        }

        return suma;
    }

    public static int restaArregloCuadrado(int[][] arreglo) {
        int resta = 0;
        int filas = arreglo.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                resta -= arreglo[i][j];
            }
        }

        return resta;
    }

    public static int multiplicacionArregloCuadrado(int[][] arreglo) {
        int multiplicacion = 1;
        int filas = arreglo.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                multiplicacion *= arreglo[i][j];
            }
        }

        return multiplicacion;
    }

    public static void main(String[] args) {
        int[][] arregloEjemplo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int suma = sumaArregloCuadrado(arregloEjemplo);
        int resta = restaArregloCuadrado(arregloEjemplo);
        int multiplicacion = multiplicacionArregloCuadrado(arregloEjemplo);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}

