package lecture2;

import java.io.File;

// public class program2_2_files {
//     public static void main(String[] args) {
//         File f1 = new File("file1.txt");
//         File f2 = new File("/Users/Igor/Documents/geek_brains/Java_знакомство_и_как_пользоваться_базовым_API/Java_lectures/file2.txt");

//     }
// }

public class program2_2_files {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch"); // ловим ошибки
        } finally {
            System.out.println("finally"); // код, который выполнится в любом случае
        }

    }
}



