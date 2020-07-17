/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на10.
Вывести полученное число
 */



        package lessson2;
import java.util.Scanner;
public class L2_task3 {
    public static void main(String[] args)
    {

        System.out.print("Введите число:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print("Ответ:");
        if (x > 0)
            System.out.println(x + 1);
        else if (x < 0)
            System.out.println(x - 2);
        else {
            x = 10;
            System.out.println(x);
             }
    }


}
