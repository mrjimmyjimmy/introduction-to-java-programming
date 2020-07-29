package ch7;

import java.util.Scanner;

/**
 * @author jimmy xu
 * @date 2020/7/29 8:06
 */
public class AnalyzeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of items: ");
        int length = scanner.nextInt();
        double[] array = new double[length];
        double sum = 0;

        System.out.println("enter numbers");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        double average = sum / length;
        int count = 0;
        for (double i : array) {
            if (i > average) count ++;
        }

        System.out.println(String.format("the average is %s", average));
        System.out.println(String.format("the count above average is %s", count));
    }

}
