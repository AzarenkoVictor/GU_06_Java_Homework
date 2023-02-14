// Реализовать простой калькулятор 
// Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

import java.util.Scanner;

public class Task03 {

     public static void main(String[] args) {
          Scanner iScanner = new Scanner(System.in);

          System.out.println("Введите 1 число: ");
          int firstNumber = iScanner.nextInt();

          System.out.println("Введите знак: ");
          String sign = iScanner.nextLine();

          System.out.println("Введите 2 число: ");
          int secondNumber = iScanner.nextInt();
          
          iScanner.close();

          int result = 0;

          switch (sign) {
               case "+":
                    result = firstNumber + secondNumber;
               case "-":
                    result = firstNumber - secondNumber;
               case "*":
                    result = firstNumber * secondNumber;
               case "/":
                    result = firstNumber / secondNumber;
               }

          System.out.printf("%d %с %d = %d", firstNumber, sign, secondNumber, result);
     }
}
