package task_13;

import java.util.Scanner;

public class Parser {

    static String map = "abcdefghijklmnopqrstuvwxyz";
    static String[] parse(String str){
        String[] result = new String[0];
        boolean check = false;
        for (String word : str.split(" ")){
            StringBuilder temp_word = new StringBuilder();
            for (char let : word.toCharArray()){
                if(map.indexOf(Character.toLowerCase(let)) >= 0) {
                    temp_word.append(let);
                }
            }
            if(!temp_word.isEmpty()) {
                String[] temp = new String[result.length + 1];
                System.arraycopy(result, 0, temp, 0, result.length);
                temp[temp.length - 1] = temp_word.toString();
                result = temp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String[] strs = parse(scan.nextLine());
        System.out.println(String.join(" ", strs));
        System.out.println("Количество слов: " + strs.length);
    }
}
