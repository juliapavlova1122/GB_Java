package lecture1;

public class program1_4_array {
    public static void main(String[] args) {
        // int [] arr = new int[10];
        // System.out.println(arr.length); // 10

        // arr = new int[] {1,2,3,4,5}; // если задан массив, не нужно указывать в []
        // его длину
        // System.out.println(arr.length); // 5

        // int [] arr = new int[10];
        // System.out.println(arr[3]); // по умолчанию если не заданы, все цифры в
        // массиве 0, буквы - пустой символ

        // int [] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);

        // МНОГОМЕРНЫЕ массивы

        // int[] arr[] = new int[3][5]; // 3 строки, 5 столбцов
        // for (int[] line : arr){
        //     for (int item : line){
        //         System.out.printf("%d", item);
        //     }
        //     System.out.println();
        // }

        // int [][] arr = new int[3][5]; // массив массивов со своими особенностями

        // for (int i = 0; i < arr.length; i++){
        //     for (int j = 0; j < arr[i].length; j++){
        //         System.out.printf("%d", arr[i][j]);
        //     }
        //     System.out.println();
        // }

        int [][] arr = new int[3][5]; // массив массивов со своими особенностями
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }

    }
}
