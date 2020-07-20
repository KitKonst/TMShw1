//)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
package lesson3;

import java.util.Scanner;

public class L3_task2 {
    public static void main(String[] args) {
        System.out.print("Введите количество времени размножения амебы:");
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int Ameb = 1;
        for (int i = 3; i <= time; i += 3) {
            Ameb *= 2;
        }
        System.out.print("Количество Амеб:"+Ameb );
    }
}