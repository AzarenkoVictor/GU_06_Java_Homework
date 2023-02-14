// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task01 {
     public static void main(String[] args) {
          System.out.println("Введите число n ");
          double result = 0;
          Scanner iScanner = new Scanner(System.in);
          int n = iScanner.nextInt();
          iScanner.close();

          result = (n * (n + 1)) / 2;
          System.out.printf("сумма чисел треугольного числа n: %.2f\n", result);

          int prod = 1;
          for (int i = 1; i < n + 1; i++) {
               for (int j = 1; j < i + 1; j++) {
                    prod = prod * j;
               }
          }
          System.out.printf("Произведение чисел треугольного числа n: %d\n", prod);
     }
}