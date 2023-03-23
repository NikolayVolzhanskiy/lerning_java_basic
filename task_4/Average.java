package task_4;
import java.util.Scanner;
public class Average {
    double x, y, z;
    Average(double _x, double _y, double _z){
        x = _x; y = _y; z = _z;
    }
    public double avg(){
        return (x+y+z)/3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        Average numb = new Average(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.printf("Среднее арифметическое = %f\n", numb.avg());

        int half = (int)(numb.avg() / 2);
        if (half > 3){
            System.out.println("Прогрмма выполнена корректно!");
        }
    }
}
