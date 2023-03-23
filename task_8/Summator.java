package task_8;

import java.util.Scanner;

public class Summator {

    private static int sum_odd(int n){
        int s = 0;
        if (n%2 == 0) --n;
        for ( ; n > 0; n -= 2){
            s += n;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = scan.nextInt();
        System.out.println("Сумма нечётных чисел до " + n + " = " + sum_odd(n));
    }
}
