//1)Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня. Какойсуммарный путь пробежит спортсмен за 7 дней?
package lesson3;

public class L3_task1 {
    public static void main(String[] args) {
        double km = 10;
        double s = km;
        for (int i = 1; i <= 7 ; i++) {
            s *= 1.1 ;
            s += km;        }
        System.out.println(" Всего за 7 дней спортсмен пробежал " + s + " Км.");
    }
}
