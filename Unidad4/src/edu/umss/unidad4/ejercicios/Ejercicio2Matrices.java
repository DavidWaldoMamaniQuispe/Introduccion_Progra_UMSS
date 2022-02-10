package edu.umss.unidad4.ejercicios;

public class Ejercicio2Matrices {
    public static void llenarMatrizConNumeros(int[][] matriz) {
        int cont = 0;
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = ++cont;
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int cols = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][4];
        int[][] matriz2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        //Ejercicio2Matrices.mostrarMatriz(matriz1);
        //Ejercicio2Matrices.mostrarMatriz(matriz2);

        Ejercicio2Matrices.llenarMatrizConNumeros(matriz1);
        Ejercicio2Matrices.mostrarMatriz(matriz1);
    }
}
