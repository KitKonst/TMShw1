package lessson2;


/*   Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей. Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника. Требуется сравнить длину каждогоотрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезококажется больше суммы двух других, то треугольника с такими сторонами несуществует.
*/
import java.util.Scanner;

public class HW2t2 {
    public static void main(String[] args)
    {
        System.out.print("введите длины сторон треугольнтка:" );
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a )
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");




    }

}
