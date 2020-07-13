/*1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
 и положительное оно или отрицательное. Например, "этооднозначное положительное число".
  Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более.
*/
import java.util.Scanner;
public class HW2t1
{
    public static void main(String[] args)
    {   System.out.println("Введите число : ");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        if(s<0)
            System.out.print("отрицательное, ");
         else
             System.out.print("положительное, ");
        int x = Math.abs(s);
        if(x > 0 && x < 10)
            System.out.print("однозначное ");
        else if(x > 9 && x < 100)
            System.out.print("двузначное ");
        else
            System.out.print("трехзначное и более :) ");
    }
}
