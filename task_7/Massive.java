package task_7;

import java.util.Scanner;
public class Massive {
    public static void main(String[] args) {
        final int x = 12, y = 7, z = 4;
        final Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();
        System.out.println("Введите значения массива: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= scan.nextInt();
        }
        for(int elem : array){
            if (elem == x || elem == y || elem == z){
                System.out.println(elem + " - Данное значение имеется в константах");
                break;
            }
        }
    }
}
