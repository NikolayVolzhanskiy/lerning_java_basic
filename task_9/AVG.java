package task_9;

import java.util.Scanner;
public class AVG {

    private static double sum_elems(double[] array){
        double result = 0.0;
        for(double elem : array){
            result += elem;
        }
        return result;
    }
    private static double avg(double[] array){
        return sum_elems(array)/array.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        double[] array = new double[scan.nextInt()];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < array.length; i++){
            array[i] = scan.nextDouble();
        }
        double meen = avg(array);
        for(double elem : array){
            System.out.printf("%.2f ", elem * meen);
        }
        System.out.println();
    }
}
