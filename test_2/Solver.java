package test_2;

import java.util.Scanner;

public class Solver {
    static int operation(int a, char op, int b){
        switch (op) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
        }
        return a;
    }
    static int solve(String equation){
        int x_index, x = 0;
        if (equation.contains("x")) x_index = equation.indexOf("x");
        else x_index = equation.indexOf("X");
        switch (x_index) {
            case 0 -> {
                if (equation.charAt(1) == '+')
                    x = operation(equation.charAt(4), '-', equation.charAt(2));
                else
                    x = operation(equation.charAt(4), '+', equation.charAt(2));
            }
            case 2 -> {
                x = operation(equation.charAt(4), '-', equation.charAt(0));
                if (equation.charAt(1) == '-') x = -x;
            }
            case 4 -> x = operation(equation.charAt(0), equation.charAt(1), equation.charAt(2));
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите урванение: ");
        String equation = scan.nextLine();
        int x = solve(equation);
        System.out.println("x = " + x);
    }
}
