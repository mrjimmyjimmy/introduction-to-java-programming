package ch7;

/**
 * @author jimmy xu
 * @date 2020/8/18 8:45
 */
public class BinarySearch {

    public static int search(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high - low > 1) {
            int mid = (high + low) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    public static void sort(int[] list) {
        // quick sort
    }

    public static void main(String[] args) {
        int[] list = Sort.LIST;
        Sort.selectionSort(list);
        int i = search(list, 11);
        System.out.println(i);
    }
}
