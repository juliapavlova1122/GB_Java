// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).

package seminar2;

import java.util.Arrays;

public class task3 {

public Boolean vozvrat(String A){

    String B="";
    String C=A.replace(" ","");
    char[] mass =C.toCharArray();
    char[] mass2=new char[mass.length];
    for ( int i =mass.length-1; i>= 0;){
        for(int j=0;j<mass2.length; j++){

        mass2[j]=mass[i]; i--;

B+=mass2[j];

        }

    }
    System.out.println(B);
    System.out.println(C);
    return B.equalsIgnoreCase(C);

}

public static void main(String args[]){
    task3 C=new task3();
    System.out.println(C.vozvrat("Madam'      I'm Adam"));
}

}