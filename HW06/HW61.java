import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HW61 {
     public static void main(String[] args) {
          Notebook notebook1 = new Notebook("Lenovo", "8", "2000", "Windows", "black");
          Notebook notebook2 = new Notebook("Lenovo", "8", "2000", "Linux", "white");
          Notebook notebook3 = new Notebook("Lenovo", "8", "2000", "Windows", "black");
          Notebook notebook4 = new Notebook("Lenovo", "16", "4000", "Windows", "black");
          Notebook notebook5 = new Notebook("Asus", "16", "4000", "Windows", "white");

          Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
                    notebook3, notebook4, notebook5));
          Map<String, String> sel = selectCriteria();
          sort(sel, notebooks);
     }

     public static String scanner() {
          Scanner scanner = new Scanner(System.in);
          String scan = scanner.nextLine();
          return scan;
     }

     public static Map<String, String> selectCriteria() {
          Map<String, String> resultChoise = new HashMap<>();
          while (true) {
               System.out.println("Выберите характеристики ?  \nДа - 'y', Нет - 'n'");
               String question = scanner();
               if (question.equals("n")) {
                    break;
               } else {

                    System.out.println(
                              "Введите цифру: \n 1 - Производитель \n 2 - ОЗУ \n 3 - Объем HDD \n 4 - ОC \n 5 - Цвет");
                    String key = scanner();
                    System.out.println("Введите значение: ");
                    String value = scanner();
                    resultChoise.put(key, value);
               }
          }
          System.out.println(resultChoise);
          return resultChoise;
     }

     public static void sort(Map<String, String> choise, Set<Notebook> notebooks) {
          Set<Notebook> temp = new HashSet<>(notebooks);
          for (Notebook notebook : notebooks) {
               for (Object pair : choise.keySet()) {
                    if (pair.equals("1") && !notebook.getName().equals(choise.get(pair))) {
                         temp.remove(notebook);
                    }
                    for (Object pair1 : choise.keySet()) {
                         if (pair1.equals("2") && !notebook.getRam().equals(choise.get(pair1))) {
                              temp.remove(notebook);
                         }
                         for (Object pair2 : choise.keySet()) {
                              if (pair2.equals("3") && !notebook.getHdd().equals(choise.get(pair2))) {
                                   temp.remove(notebook);
                              }
                              for (Object pair3 : choise.keySet()) {
                                   if (pair3.equals("4")
                                             && !notebook.getOperatingSystem().equals(choise.get(pair3))) {
                                        temp.remove(notebook);
                                   }
                                   for (Object pair4 : choise.keySet()) {
                                        if (pair4.equals("5") && !notebook.getColour().equals(choise.get(pair4))) {
                                             temp.remove(notebook);
                                        }
                                   }
                              }
                         }
                    }
               }
          }
          if (temp.isEmpty()) {
               System.out.println("Ничего не найдено!");
          } else {
               System.out.println("В наличии: \n" + temp.toString());
          }
     }
}