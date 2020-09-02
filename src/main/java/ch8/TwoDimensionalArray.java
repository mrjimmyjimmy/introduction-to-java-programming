package ch8;

import java.util.Random;

/**
 * @author jimmy xu
 * @date 2020/8/28 17:13
 */
public class TwoDimensionalArray {
    public static int[][][] c = c();

    public static void main(String[] args) {
        System.out.println(c[1][2][1]);
        System.out.println(c[1][1][1]);
        System.out.println(c[1][0][1]);
        System.out.println(c[0][2][1]);
        System.out.println(c[0][1][1]);
        System.out.println(c[0][0][1]);
    }

    public static int i() {
        return new Random().nextInt();
    }

    public static int[] a() {
        return new int[]{i(), i()};
    }

    public static int[][] b() {
        return new int[][] {a(), a(), a()};
    }

    public static int[][][] c() {
        return new int[][][] {b(), b(), b(), b()};
    }
}
