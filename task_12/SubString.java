package task_12;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку \"I like Java!!!\": ");
        String string = scan.nextLine();
        if (string.contains("Java") && string.startsWith("I like") && string.endsWith("!!!")){
            System.out.println(string.toUpperCase());
            String str_rep = string.replaceAll("a", "o");
            System.out.println(str_rep.substring(str_rep.indexOf('o')-1,str_rep.lastIndexOf('o')+1));

        }
        else System.out.println("Не верная строка!");

    }
}
