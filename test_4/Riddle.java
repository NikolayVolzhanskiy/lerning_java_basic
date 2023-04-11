package test_4;

import java.util.Scanner;

public class Riddle {

    private final static int attempts = 3;
    private final static String[] answer = {"Заархивированный вирус", "заархивированный вирус"};
    private final static String clue = "Отгадка связана с архивами";
    private final static String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";

    private static int step = attempts;

    static String get(){
        return riddle;
    }
    static boolean game(String _answer){
        boolean result = false;
        switch (step) {
            case attempts -> {
                if (_answer.equals("подсказка") || _answer.equals("Подсказка")) {
                    System.out.println("Подсказка: " + clue);
                    result = true;
                } else if (_answer.equals(answer[0]) || _answer.equals(answer[1])) {
                    System.out.println("Правильно!!!");
                } else {
                    System.out.println("Подумай еще!");
                    step--;
                    result = true;
                }
            }
            default -> {
                if (_answer.equals("подсказка") || _answer.equals("Подсказка")) {
                    System.out.println("Подсказка уже недоступна.");
                    result = true;
                }else if (_answer.equals(answer[0]) || _answer.equals(answer[1])) {
                    System.out.println("Правильно!!!");
                } else {
                    System.out.println("Подумай еще!");
                    step--;
                    result = true;
                }
            }
            case 1 -> {
                if (_answer.equals("подсказка") || _answer.equals("Подсказка")) {
                    System.out.println("Подсказка уже недоступна.");
                    result = true;
                } else if (_answer.equals(answer[0]) || _answer.equals(answer[1])) {
                    System.out.println("Правильно!!!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
        return result;
    }
}
class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Отгадай загадку!\n" + Riddle.get());
        String answer = scan.nextLine();
        while(Riddle.game(answer))
            answer = scan.nextLine();
    }
}
