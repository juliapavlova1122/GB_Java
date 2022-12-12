package lecture1;

// public class program7_function {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }
//     static double factor(int n) {
//         if(n==1) return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); //120.0
//     }
// }

// Управляющие конструкции
// public class program7_function {
//     public static void main(String[] args) {
//         int a = 7;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class program7_function {
//     public static void main(String[] args) {
//         int a = 7;
//         int b = 2;
//         int c = 0;
//         if (a > b)
//             c = a;
//         if (b > a)
//             c = b;
//         System.out.println(c);
//     }
// }


// public class program7_function {
//     public static void main(String[] args) {
//         int a = 7;
//         int b = 2;
//         int min = a < b ? a : b; // будет возвращена часть после ? (a) и до b.
//         System.out.println(min);
//     }
// }

// Оператор выбора
import java.util.Scanner;
public class program7_function {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int month = iScanner.nextInt();
        
        String text = "";
        switch(month){
            case 1:
            if (month == 1) {
                text = "January";
            }
            break;
            case 2:
            if (month == 2) {
                text = "February";
            }
            break;

            default:  // необязательно
            if (month!= 1 || month!=2) 
            text = "mistake";
            break;
        }
        System.out.println(text);
        iScanner.close();
    }
}














