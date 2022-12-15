// Заполнить список названиями планет Солнечной системы 
// в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество 
// его повторений в списке.

package seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;


public class task3_3 {
    public static void main(String[] args) {
        ArrayList<String> earth = earth1(15);
        System.out.println(earth.toString());
        System.out.println();
        Map<String, Long> frequency = earth.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        frequency.forEach((k, v) -> System.out.println(k + ": " + v));

    }

    public static ArrayList<String> earth1(int count) {
        ArrayList<String> earth = new ArrayList<>();
        Random random = new Random();
        String[] variants = {"Earth", "Mars", "Venera", "Uran", "Neptun", "Jupiter", "Mercury", "Saturn"};
        for (int index = 0; index < count; index++) {
            earth.add(variants[random.nextInt(variants.length)]);
        }
        return earth;
    }
    public static void find(ArrayList<String> earth) {
        // ArrayList<String> earth = earth1(15);
        String[] variants = { "Earth", "Mars", "Venera", "Uran", "Neptun", "Jupiter", "Mercury", "Saturn" };
        int count = 0;
        for (String item : variants) {
            for (int index = 0; index < earth.size(); index++) {
                if (item.equals(earth.get(index))) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", item, count);
            count = 0;
        }
    }
}
    // public static void find(ArrayList<String> earth) {
    //     // ArrayList<String> earth  = earth1(15);
    //     int count = 0;
    //     for (String item : earth) {
    //         for (int index = 0; index < earth.size(); index++) {
    //             if(item.equals(earth.get(index))){
    //                 count++;
    //             }
    //           }
    //         System.out.printf("%s: %d\n", item, count);
    //         count = 0;
    //     }
    // }


    // другое решение 
//     public static void Task() {
//         ArrayList<String> my_array = new ArrayList<String>();
//         my_array.add("Меркурий");
//          my_array.add("Земля");
//          my_array.add("Венера");
//          my_array.add("Юпитер");
//          my_array.add("Нептун");
//          my_array.add("Солнце");
//          my_array.add("Нептун");
//          /*ArrayList<String> my_array2 = new ArrayList<String>();
//          StringBuilder stringBuilder = new StringBuilder();
//          for(String text : my_array) {
//              if (!my_array2.contains(text)) {
//                  //my_array.stream().filter(i -> Objects.equals(i, text)).count() (прост подумал зачем два for)
//                  System.out.println(text + ": " + my_array.stream().filter(i -> Objects.equals(i, text)).count());
//              }
//              my_array2.add(text);
//          }
//          my_array = (ArrayList<String) my_array.stream().distinct().collect(Collectors.toList());
//          System.out.println(my_array);*/
//          //System.out.println(countNamesPlanetAndReturnNotRepeatNamesPlanet(my_array));
 
//      }
//     }
//      //считает название планет и возращает неповторяющиейся имена планет
// //      public static ArrayList<String> countNamesPlanetAndReturnNotRepeatNamesPlanet(ArrayList<String> arr) {
// //          ArrayList<String> my_array = new ArrayList<String>();
// //          for(int i = 0; i < arr.size(); i++) {
// //              int count = 0;
// //              for(int j = 0; j < arr.size(); j++) {
// //                  if(arr.get(j).equals(arr.get(i))) { //сверяем меркурий с меркурием, меркурий с землей и тд, потом земля с меркурием и так далее
// //                      count+=1;
// //                  }
// //              }
// //              if (!my_array.contains(arr.get(i))) { //проверяем если планета уже в списке чтоб меркурий 2 раза не повторялся по типу Меркурий: 2, Меркурий: 2
// //                  System.out.println(arr.get(i) + ": " + count); //Вывод
// //                  my_array.add(arr.get(i)); //Записываем в список чтоб не повторялось "не повторялся по типу Меркурий: 2, Меркурий: 2"
// //              }
// //          }
// //          return my_array; //возращаем список
// //      }
    
// // }

// // еше решение
// package sm03;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Random;
// import java.util.Map.Entry;

// public class Task02 {
//     public static void main(String[] args) {
//         ArrayList<String> planets = new ArrayList<String>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"));
//         ArrayList<String> planetsMore = new ArrayList<String>(20);
//         for (int i = 0; i < 20; i++) {
//             planetsMore.add(planets.get(new Random().nextInt(9)));

//         }
//         System.out.println(planets);
//         System.out.println(planetsMore);
//         HashMap<String, Integer> planetsMap = new HashMap<String, Integer>();
//         for (String planet : planetsMore) {
//             if (planetsMap.get(planet) == null) {
//                 planetsMap.put(planet, 1);
//             } else {
//                 planetsMap.put(planet, planetsMap.get(planet) + 1);
//             }
//         }
//         for (Entry<String, Integer> elem : planetsMap.entrySet()) {
//             System.out.println(elem);
//         }
//         for (Entry<String, Integer> elem : planetsMap.entrySet()) {
//             if ((int)elem.getValue() > 1) {
//                 while (planetsMore.contains(elem.getKey())) {
//                     planetsMore.remove(elem.getKey());
//                 }
//             };
//         }
//         System.out.println(planetsMore);
//     }
// }




