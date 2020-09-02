package ch7;

import java.util.Arrays;

/**
 * @author jimmy xu
 * @date 2020/8/28 14:55
 */
public class Calculator {
    public static void main(String[] args) {
        if (args.length == 0) System.out.println(true);
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;
        switch (args[1]) {
            case "+":
                result = getInt(args[0]) + getInt(args[2]);
                break;
            case "-":
                result = getInt(args[0]) - getInt(args[2]);
                break;
            case ".":
                result = getInt(args[0]) * getInt(args[2]);
                break;
            case "/":
                result = getInt(args[0]) / getInt(args[2]);
                break;
            default:
                System.out.println("Operation " + args[1] + " not supported");
        }
        System.out.println(Arrays.toString(args) + " = " + result);
    }

    private static int getInt(String s) {
        return Integer.parseInt(s);
    }
}
