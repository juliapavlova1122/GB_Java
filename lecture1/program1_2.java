package lecture1;
/**
 * program2
 */
public class program1_2 {
    public static void main(String[] args) {
        // String s = " 2" ;  - // напечатает 2
        // String s = null; // пустая строка, важно идентифицировать начальное значение
        // System.out.println(s);

        // short age = 10;  // целые
        // int salary = 123456; // тоже целые, но больше цифр может быть
        // System.out.println(age); // 10
        // System.out.println(salary); // 123456

        // float e = 2.7f;  // обязательно использовать суффикс f (тип float)
        // double pi = 3.1415; // суффикс d есть, но необязательный
        // System.out.println(e); // 2.7
        // System.out.println(pi); // 3.1415

        // char ch = '1';  // 
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // System.out.println(Character.isDigit(ch)); // false

        // boolean flag1 = 123 <= 234; 
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1; // &&  и то и другое, || или то или другое или оба
        // System.out.println(flag2); // true
        // boolean flag3 = flag1 ^ flag2; // ^ раздлительная дизьюнкция - либо - либо
        // System.out.println(flag3); // false

        // String msg = "hello world";  // строка
        // System.out.println(msg);

        var i = 123; // неявная типизация
        System.out.println(i);
        var a = 123.123;
        System.out.println(a);
        var b = 456*4;
        System.out.println(b); 
        System.out.println(getType(a));
        System.out.println(getType(i));
        System.out.println(getType(b));

    }
    static String getType(Object o) {        // для работы getType
        return o.getClass().getSimpleName();
    
    }
}



