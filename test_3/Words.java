package test_3;

import java.util.Scanner;

public class Words {

    static String find(String[] words){
        int k = -1;
        int count_c = 0;
        for(String word : words){
            int n = 0;
            char[] word_arr = word.toCharArray();
            for(int i = 0; i < word_arr.length; i++){
                for (int j = i+1; j < word_arr.length; j++){
                    if(word_arr[i] != word_arr[j]) n++;
                }
            }
            if(n > count_c) {
                count_c = n;
                k++;
            }
        }
        return words[k];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = Integer.parseInt(scan.nextLine());
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Введите строку %d: ", i + 1);
            words[i] = scan.nextLine();
        }
        System.out.println("Ответ: " + find(words));
    }
}
