package lecture2;

// public class program2_1StringBuilder {
//     public static void main(String[] args) {
//         String str = "";
//         for(int i = 0; i < 1_000_000; i++){
//             str+= "+";          // строка из млн + - минута
//         }
//     }
// }

// public class program2_1StringBuilder {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < 1_000_000; i++){
//             sb.append("+");   // строка из млн + - милисекунды
//         }
//     }
// }

// Строки

// concat(): // объединение строк
// valueOf()    преобразует Object в строку (завяхан на toString)
// join()       объединяет набор строк в 1 с разделителем
// charAt()     получение символа по индексу
// indexOf()    1 индекс вхождения подстроки
// lastIndexOf()  определяет, начинается / заканчивается ли строка с подстроки
// startsWith() / endsWith()   замена одной подстроки на другую
// replace()

// trim()
// substring() возвращает подстроку
// toLowerCase / toUpperCase
// compareTo() сравнивает 2 строки
// equals() -                   с учетом регистра
// equalsIgnoreCase()           без учета
// regionMatches()  сравнивает подстроки в строках

public class program2_1StringBuilder {
        public static void main(String[] args) {
            String s = "Welcome to Java";
            System.out.println(s.substring(3, 7)); // 3,4,5,6, начало включает, конец не включает  - come
            System.out.println(s.substring(3)); // c 3 знака до конца // come to Java
        }
    }






