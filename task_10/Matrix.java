package task_10;

import java.util.Scanner;

public class Matrix {
    public static double[][] input_matrix(int a, int b){
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[a][b];
        System.out.println("Введите значения матрицы:");
        for(int i = 0; i < a; i++){
            System.out.printf("Введите значения %dой строки:\n", i+1);
            for (int j = 0; j < b; j++){
                matrix[i][j] = scan.nextDouble();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        double[][] matrix = input_matrix(scan.nextInt(),scan.nextInt());
        for(double elem : matrix[0]){
            System.out.printf("%.2f ", elem*3);
        }
    }
}
