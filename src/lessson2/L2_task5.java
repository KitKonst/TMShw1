package lessson2;

import java.util.Scanner;



public class L2_task5
{
    public static void main(String[] args)
    {
        System.out.print("Введите 3 числa:");
        Scanner s = new Scanner(System.in);
        int countNegative = 0;
        int countPositive = 0;
        for(int i = 0; i < 3; i++) {
            int x = s.nextInt();
            if(x < 0) {
                countNegative++;
            } else if(x > 0) {
                countPositive++;
            }
        }
        System.out.printf("Положительных: %d%nОтрицательных: %d%n%n", countPositive, countNegative);






    }
}

