// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package seminar1;

public class task3_1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1,1,1,1,1,1,1};
        int count = 1;
        int max_count = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if ((array[i] == 1) && (array[i] == array[i + 1])) {
                count++;
                if (max_count < count) {
                    max_count = count;
                }
            }

            else {
                count = 1;   
            }
        }
        System.out.print(max_count);
    }
}







