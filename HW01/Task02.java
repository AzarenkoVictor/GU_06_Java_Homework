
// Вывести все простые числа от 1 до 1000

public class Task02 {
     public static void main(String[] args) {
          System.out.println("Все простые числа от 1 до 1000: ");

          for (int i = 2; i < 1001; i++) {
               boolean PrimeNum = true;
               for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                         PrimeNum = false;
                         break;
                    }
               }
               if (PrimeNum == true) {
                    System.out.printf(" %d,",i);
               }
          }
     }
}