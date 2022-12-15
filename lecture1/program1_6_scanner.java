package lecture1;

import java.util.Scanner;

// public class program6_scanner {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("name: ");
//         String name = iScanner.nextLine(); // получение следующей строки
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// public class program6_scanner {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y); // 7
//         iScanner.close();
//     }
// }

// Проверка

// public class program6_scanner {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt(); // проверяем, что введено целове число
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

// ФОРМАТИРОВАННЫЙ вывод
// public class program6_scanner {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// public class program6_scanner {
//     public static void main(String[] args) {
//         String s = "qwe";
//         int a = 123;       // неявное преобразование цифры в строку
//         String q = s + a; // операция конкатенации
//         System.out.println(q); // qwe123
//     }
// }

// public class program6_scanner {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c); //1 + 2 = 3
//         System.out.println(res); //1 + 2 = 3
//     }
// }

// public class program6_scanner {
//     public static void main(String[] args) {
//         double a = 1.5, b = 2.25;
//         double c = a + b;
//         String res = String.format("%s + %s = %s \n", a, b, c);
//         System.out.printf("%f + %f = %f \n", a, b, c); //1,500000 + 2,250000 = 3,750000
//         System.out.println(res); //1.5 + 2.25 = 3.75
//     }
// }

// ВИДЫ спецификаторов
// %d - целочисленные
// %f - дробные, 6 знаков по умолчанию
// %s - строковые значения

// public class program6_scanner {
//     public static void main(String[] args) {
        
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi); // 3,141500
//         System.out.printf("%.2f\n", pi); //3,14
//         System.out.printf("%.3f\n", pi); //3,141
//         System.out.printf("%e\n", pi); //3,141500e+00 - число в экспоненциальной форме
//         System.out.printf("%.2e\n", pi); //3,14e+00
//         System.out.printf("%.3e\n", pi); //3,141e+00
//     }
// }

// // ОБЛАСТЬ ВИДИМОСТИ переменных
public class program1_6_scanner {
    static int t = 123; // можно задать на весь класс
    public static void main(String[] args) {
        int b = 111;  // может использоваться везде
        {
            int a = 222; // используется в пределах{} снаружи недоступна
            System.out.println(a+b); // 333
            System.out.println(a); // 222
            System.out.println(b); // 111
        }
        int a = 123; // можно задать новую a
        System.out.println(a); // 123
        System.out.println(a+b); // 234
    }
}











