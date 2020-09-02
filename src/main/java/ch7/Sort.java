package ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jimmy xu
 * @date 2020/8/26 16:40
 */
public class Sort {

    public static final int[] LIST = {4, 2, 56, 2, 4, 3, 7, 4, 23, 5, 67, 7, 2, 4, 6, 7, 4, 2, 34, 1, 6, 5, 7, 43, 534, 5, 3};

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[min] > list[j]) {
                    min = j;
                }
            }
            swap(list, i, min);
        }
    }

    private static void swap(int[] list, int i, int j) {
        int tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }

    public static void main(String[] args) {
        Arrays.parallelSort(LIST);
        System.out.println(Arrays.toString(LIST));
    }
}
