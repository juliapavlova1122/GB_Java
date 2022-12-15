package lecture1;

public class program1_3 {
    public static void main(String[] args) {
        // int i = 23_123_123; // можно разделять разряды нижним подчеркиванием для наглядности
        // System.out.println(i);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.toString(i));

        // int a = 123;
        // System.out.println(a); // 123
        // a++;
        // System.out.println(a); // 124

        // int a = 123;
        // System.out.println(a++); // 123
        // System.out.println(a);  // прибавится 1  - 124

        // int a = 123;
        // System.out.println(++a); // 124
        // System.out.println(a);  //  124

        // int a = 123;
        // a = a-- - --a;
        // System.out.println(a);  //  2

        // a = --a - a--;
        // System.out.println(a);  //  0
        
        // int c = --a;
        // System.out.println(c);  //  2

        // boolean f = 123 > 234;
        // System.out.println(f);
        
        // int a = 8;
        // System.out.println(Integer.toBinaryString(a)); // 1000
        // a = a << 1;
        // System.out.println(a); // 16
        // System.out.println(Integer.toBinaryString(a)); //10000

        // int a = 8;
        // System.out.println(a << 1); // 16


        // int a = 9;
        // System.out.println(Integer.toBinaryString(a)); // 1001
        // a = a >> 1;
        // System.out.println(a); // 4
        // System.out.println(Integer.toBinaryString(a)); //100

            // int a = 5;
            // int b = 2;
            // // System.out.println(a | b); // | - или, выбираем 1, & - и, выбираем 0.
            // System.out.println(a & b); // 0
            // // 101
            // // 010
            // // 111  - 7

        // String s = "qwer"; // 4 символа - 0 1 2 3
        // boolean b = s.length() >= 5 && s.charAt(4) == '1'; // проверяем, что длина строки >= 5, а 5 символ 1
        // System.out.println(b);

        String s = "qwe1"; // 4 символа - 0 1 2 3
        boolean b = s.length() >= 4 && s.charAt(3) == '1'; // проверяем, что длина строки >= 5, а 5 символ 1
        System.out.println(b);


    }
        
    }
    

