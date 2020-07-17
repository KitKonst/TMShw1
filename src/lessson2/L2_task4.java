/*.4) Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.
*/


        package lessson2;
import java.util.Scanner;
public class L2_task4
{
    public static void main(String[] args)
    {
        System.out.print("Введите 3 числa:");
        Scanner s = new Scanner(System.in);

        int countPositive = 0;
              for(int i = 0; i < 3; i++) {
                  int x = s.nextInt();
            if(x > 0)     countPositive++;
                    }
        System.out.println ( countPositive );






    }
}
