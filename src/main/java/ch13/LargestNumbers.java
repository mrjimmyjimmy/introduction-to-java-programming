package ch13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author jimmy xu
 * @date 2021/5/27 16:13
 */
public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("the largest number is " + getLargestNumber(list));
    }

    private static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) return null;

        Number curr = list.get(0);
        for (Number number : list) {
            if (curr.doubleValue() < number.doubleValue()) curr = number;
        }
        return curr;
    }
}
