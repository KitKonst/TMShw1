package lessson2;

import java.util.Scanner;

public class L2_task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество программистов: ");
        int n = s.nextInt();
        if (n > 4) System.out.println(n + " Программистов");

        else if (1 < n && n < 5)
            System.out.println(n + " Программиста");
        else if (n == 1)
            System.out.println(n + " Программист");
    }
}
