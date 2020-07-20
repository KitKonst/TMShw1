//7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
package lesson3;

public class L3_task7 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) s += i;


        }
        System.out.print(s);

    }
}

