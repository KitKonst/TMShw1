//5)Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
package lesson3;

public class L3_task5 {
    public static void main(String[] args) {
        float s = 0;
        for (int i = 1; i <= 20; i++) {
            s+= 2.54;
            System.out.println( " Дюймы: " + i + " Сантиметры:" + s );
        }
    }
}
