// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

package seminar1;

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,0,1,1,1,1,1,1,0,1}; //Массив
        int findNumber = 1; //Число которое надо найти
        int count = 0; //
        int countMax = 0;
        int maxLenghtArray = arr.length - 1;
        for(int i : arr) {
            if(findNumber == i) {
                 count+=1;
                 if(maxLenghtArray == 0) {
                     if(count >= countMax) {
                         countMax = count;
                     }
                     count=0;
                 }
            }
            else {
                if(count >= countMax) {
                    countMax = count;
                }
                count=0;
            }
            maxLenghtArray-=1;
        }
        System.out.println(countMax);
    }
}
        
       