package lecture1;

// public class program8_loops {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count); // количество цифр в числе
//     }
// }

// public class program8_loops {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             // System.out.print(i); // выведет в строку подряд
//             System.out.println(i); // выведет в столбец
//         }
//     }
// }

// public class program8_loops {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) { 
//             // if (i % 2 == 0) { // выведет нечетные числа
//             if (i % 2 != 0) { // выведет четные числа
//                 continue;
//                 // break; // 0
//             }
//             System.out.println(i); 
//         }
//     }
// }

// public class program8_loops {
//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += 1;
//         }
//         System.out.println(s);
//     }
// }

// "foreach" - работает для коллекций
// public class program8_loops {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr){
//             System.out.printf("%d", item); // 0000000000
//         }
        
//         System.out.println(); // пустая строка
//     }
// }

public class program8_loops {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,77};
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = 10;
        // }
        for (int item : arr) {
            System.out.println(item);  // перебор коллекции (массив - коллекция)
        }
    }
}

