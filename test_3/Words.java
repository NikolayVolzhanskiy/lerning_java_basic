package test_3;

import java.util.Scanner;

public class Words {

    static String find(String[] words){
        String unique_chars = "";
        int index_word = 0;
        for(int k = 0; k < words.length; k++){
            char[] word_arr = words[k].toCharArray();
            StringBuilder temp = new StringBuilder(String.valueOf(word_arr[0]));
            for(int i = 1; i < word_arr.length; i++){
                boolean unique = true;
                for (int j = 0; j < temp.length(); j++){
                    if(word_arr[i] == temp.charAt(j)){
                        unique = false;
                        break;
                    }
                }
                if(unique) temp.append(word_arr[i]);
            }
            if(temp.length() > unique_chars.length()) {
                index_word = k;
                unique_chars = temp.toString();
            }
        }
        return words[index_word];
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
