package test_1;

import java.util.Scanner;

public class Corrency_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double rate = scan.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rub = scan.nextDouble();
        System.out.printf("Итого: %.2f", rub/rate);
    }
}
