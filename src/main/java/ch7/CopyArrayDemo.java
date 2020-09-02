package ch7;

import java.util.Arrays;

/**
 * @author jimmy xu
 * @date 2020/8/4 17:34
 */
public class CopyArrayDemo {

    public static void main(String[] args) {
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];
//        for (int i = 0; i < sourceArray.length; i++) {
//            targetArray[i] = sourceArray[i];
//        }
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(targetArray));
    }
}
