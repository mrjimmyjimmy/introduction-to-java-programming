/**
 * @author jimmy xu
 * @date 2020/6/24 14:02
 */
public class Main {
    public static int a;
    public static void main(String[] args) {
        int x = 1;
        Main.a = 1;
    }

    public static double max(int a, int b) {
        for (int i = 0; i < 10; i++) {
            Main.a = a;
        }
        for (int i = 0; i < 10; i++) {

        }
        if (a > b) return a;
        else return b;
    }

    public static double max(double a, double b) {
        if (a > b) return a;
        else return b;
    }

}
