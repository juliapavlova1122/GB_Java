// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести 
// его на экран.


package seminar3;

import java.util.Random;
import java.util.ArrayList;


public class task3_2 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list1.add(rand.nextInt(10));
        }
    list1.sort(null);
    System.out.println(list1.toString());

    }
}

// int size = 10;
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         for(int i = size; i > 0; i--) {
//             arr.add(new Random().nextInt(100));
//         }
//         Collections.sort(arr);
//         System.out.println(arr);


