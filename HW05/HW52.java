
// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HW52 {
     public static void main(String[] args) {
          List<String> sotrudniki = List.of("Пётр", "Иван", "Антон", "Пётр", "Пётр", "Пётр", "Антон",
                    "Антон", "Иван", "Пётр", "Антон", "Иван", "Пётр", "Иван", "Пётр", "Антон", "Иван", "Пётр", "Антон",
                    "Антон", "Антон");
          System.out.println(repeat(sotrudniki));
     }

     private static Map<String, Integer> repeat(List<String> workers) {
          Map<String, Integer> nameCount = new LinkedHashMap<>();

          for (int i = 0; i < workers.size(); i++) {
               if (nameCount.containsKey(workers.get(i))) {
                    nameCount.put(workers.get(i), nameCount.get(workers.get(i)) + 1);
               } else {
                    nameCount.put(workers.get(i), 1);
               }
          }

          Map<String, Integer> sortedMap = nameCount.entrySet().stream()
                    .sorted(Comparator.comparingInt(e -> -e.getValue()))
                    .collect(Collectors.toMap(
                              Map.Entry::getKey,
                              Map.Entry::getValue,
                              (a, b) -> {
                                   throw new AssertionError();
                              },
                              LinkedHashMap::new));
          return sortedMap;
     }

}