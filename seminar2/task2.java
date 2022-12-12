// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//результат - a4b3cd2 для примера


package seminar2;

import java.util.Scanner;

public class task2 {
    public static void formatter(int counter, char ch) {
        if (counter != 1) {
            System.out.printf("%s%d", ch, counter);
        } else {
            System.out.printf("%s", ch);
        } 
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String orig = iScanner.next();
        System.out.print("Результат: ");
        // String orig = "aaaabbbcddeeaavqq";
        int counter = 1;
        for (int i = 0; i < orig.length() - 1; i++) {
            if (orig.charAt(i) == orig.charAt(i + 1)) {
                counter++;
            } else {
                formatter(counter, orig.charAt(i));
                counter = 1;
            }
        }
        formatter(counter, orig.charAt(orig.length() - 1));
        iScanner.close();
    }
}


// package seminar2;

// import java.util.List;
// import java.util.ArrayList;
// import java.util.Arrays;

// public class task2 {
//     public static void main(String[] args) {
        
//         StringBuilder sb = new StringBuilder();
//     int count = 1;
//     String s = "aaaabbbcdd";

//     for(int i = 0; i < s.length(); i++) {
//         if (s.charAt(i) == s.charAt(i+1)){
//             count++;
//         else{if(count == 1){
//             sb.append(s.charAt(i));
//         }}
//         }
//         System.out.println();
//     }
//     // List<String> list = new ArrayList<String>(Arrays.asList("hello"));
//     // System.out.println(list);
//     }


// }
