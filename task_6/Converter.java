package task_6;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Converter {
    private int obj, ei;
    private final Scanner scan;
    private void conversion(){
        switch (obj) {
            case 1 -> {
                System.out.println("Выберите единицу измерения: 1 - кг, 2 - грамм, 3- фунт, 4 - унция");
                ei = scan.nextInt();
                System.out.println("Введите число");
                conversion_mass(scan.nextDouble());
            }
            case 2 -> {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                ei = scan.nextInt();
                System.out.println("Введите число");
                conversion_distance(scan.nextDouble());
            }
            default -> System.out.println("Неверный ввод!");
        }
    }
    private void conversion_mass(double numb){
        switch (ei) {
            case 2 -> {
                numb /= 1000;
            }
            case 3 -> {
                numb *= 0.45359237;
            }
            case 4 -> {
                numb /= 35.27396195;
            }
            default -> {
                System.out.println("Неверный ввод!");
                return;
            }
        }
        System.out.printf("""
                        Результат:
                        Килограммы: %.3f
                        Граммы: %.3f
                        Фунты: %.3f
                        Унции: %.3f
                        """, numb, numb*1000, numb/0.45359237, numb*35.27396195);
    }
    private void conversion_distance(double numb){
        switch (ei) {
            case 2 -> {
                numb /= 0.62137;
            }
            case 3 -> {
                numb /= 1.093613298;
            }
            case 4 -> {
                numb /= (1.093613298 * 3);
            }
            default -> {
                System.out.println("Неверный ввод!");
                return;
            }
        }
        System.out.printf("""
                        Результат:
                        Метры: %.3f
                        Мили: %.3f
                        Ярды: %.3f
                        Футы: %.3f
                        """, numb, numb*0.62137, numb*1.093613298, numb*1.093613298*3);
    }
    Converter(){
        scan = new Scanner(System.in);
    }
    public void start(){
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        obj = scan.nextInt();
        conversion();
    }

    public static void main(String[] args) {
        Converter conv = new Converter();
        conv.start();
    }
}
