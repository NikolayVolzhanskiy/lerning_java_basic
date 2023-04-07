package task_11;

import java.util.Scanner;
public class InputAndCompare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String firstNumb = scan.nextLine();
        System.out.print("Введите второе число: ");
        int secondNumb = scan.nextInt();
        if (secondNumb < Integer.parseInt(firstNumb)) {
            System.out.println(firstNumb);
            System.out.println((double)secondNumb);
        } else {
            System.out.println(secondNumb);
            System.out.println(Double.parseDouble(firstNumb));
        }
    }
}
