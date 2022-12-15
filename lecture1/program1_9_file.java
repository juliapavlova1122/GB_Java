package lecture1;

// Запись файла

// import java.io.FileWriter;
// import java.io.IOException;

// public class program1_9_file {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)){
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }


// // Чтение файла построчно

// import java.io.*;

// public class program1_9_file {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }


// Чтение файла посимвольно

import java.io.*;

public class program1_9_file {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.println(ch);
            }
        }
    }
}


