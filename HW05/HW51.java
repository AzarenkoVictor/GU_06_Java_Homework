
// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что один человек может иметь несколько телефонов.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HW51 {
     public static void main(String[] args) {
          Map<String, List<String>> phoneBook = new HashMap<>();
          phoneBook.put("Petr", List.of("423144", "2342314"));
          phoneBook.put("Ivan", List.of("21342134", "213421344"));
          phoneBook.put("Vasilij", List.of("2134213423", "213412342314"));
          phoneBook.put("Zenja", List.of("2134231434", "21342342134"));
          phoneBook.put("Anton", List.of("2314123423141234", "123412341234"));
          menu(phoneBook);
     }

     private static String scanner() {
          Scanner scanner = new Scanner(System.in);
          String scan = scanner.nextLine();
          return scan;
     }

     private static void find(Map<String, List<String>> phoneBook) {
          System.out.println("Введи имя: ");
          String name = scanner();
          System.out.println(phoneBook.get(name));
     }

     private static void allBook(Map<String, List<String>> phoneBook) {
          System.out.println(phoneBook);

     }

     private static Map<String, List<String>> add(Map<String, List<String>> phoneBook) {
          System.out.println("Для выхода нажми stop");
          System.out.println("Введи имя: ");
          String name = scanner();
          List<String> number = new ArrayList<>();
          while (true) {
               System.out.println("Введи номер: ");
               String phon = scanner();
               if (phon.equals("stop")) {
                    break;
               } else {
                    number.add(phon);
               }
          }
          phoneBook.put(name, number);
          return phoneBook;
     }

     private static Map<String, List<String>> menu(Map<String, List<String>> phoneBook) {
          System.out.println(
                    "Введите команду из списка: find - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, exit - выйти");
          while (true) {
               String comands = scanner();
               if (comands.equals("exit")) {
                    break;
               } else {
                    switch (comands) {
                         case "find":
                              find(phoneBook);
                              break;
                         case "add":
                              add(phoneBook);
                              break;
                         case "all":
                              allBook(phoneBook);
                              break;
                         default:
                              break;
                    }
               }
          }
          return phoneBook;
     }
}