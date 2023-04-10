package test_3;

import java.util.Scanner;

public class Words {

    static String find(String[] words){
        int k = -1;
        for(String word : words){
            int temp = word.length();
            int n = 0;
            for(char symbol : word.toCharArray()){
                for (char s : word.toCharArray()){
                    if(s == symbol) n++;
                }
            }
            if(n < temp) {
                temp = n;
                k++;
            }
        }
        return words[k];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scan.nextInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Введите строку %d: ", i);
            words[i] = scan.nextLine();
        }
        System.out.println("Ответ: " + find(words));
    }
}
