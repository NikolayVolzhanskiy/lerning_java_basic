package task_5;
import java.io.IOException;
import java.util.Scanner;
public class Calculator {
    private double a, b;
    Calculator(){

    }
    public void set(double _a, double _b){
        a = _a;
        b = _b;
    }
    public void calculate(char operator){
        switch (operator) {
            case '+' -> {
                System.out.printf("%f %c %f = %f", a, operator, b, a + b);
            }
            case '-' -> {
                System.out.printf("%f %c %f = %f", a, operator, b, a - b);
            }
            case '*' -> {
                System.out.printf("%f %c %f = %f", a, operator, b, a * b);
            }
            case '/' -> {
                if (b != 0){
                    System.out.printf("%f %c %f = %f", a, operator, b, a / b);
                } else {
                    System.out.println("Деление на 0!");}
            }
            default -> System.out.println("Введена не верная опервация");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа и арифметическую операцию");
        Calculator calc = new Calculator();
        calc.set(scan.nextDouble(), scan.nextDouble());
        calc.calculate(scan.next().charAt(0));
    }
}
