//4)Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.
package lesson3;
import java.util.Scanner;
public class L3_task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа A и B");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;
         for (int i = 0; i < a; i++) {
            sum += b;
        }
        System.out.println(a + "*" + b + "=" + sum);
    }



}
