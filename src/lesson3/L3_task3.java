//3)Вычислить: 1+2+4+8+...+256
package lesson3;

public class L3_task3 {
    public static void main(String[] args) {
    int s = 0;
    for (int i = 1; i <= 256; i *= 2) {
        s += i;
    }
    System.out.print("итого: " + s);
}

}
