package lessson2;

import java.util.Scanner;

public class L2_task6 {
    public static void main(String[] args) {

        System.out.println("Введите 2 числа:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("Боьшее число:");
        if (a > b) {
            System.out.print(a);
        }
        if (a < b) {
            System.out.print(b);
        }
    }
}



