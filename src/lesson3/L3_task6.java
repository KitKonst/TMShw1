//6)Напишите программу вывода всех четных чисел от 2 до 100 включительно
package lesson3;

public class L3_task6 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 100; i += 2) {
            s += 2;
            System.out.print(s + " ");
        }
    }
}
