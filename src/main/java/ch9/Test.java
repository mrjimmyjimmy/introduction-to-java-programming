package ch9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jimmy xu
 * @date 2021/4/15 13:04
 */
public class Test {

    private int x = 0;

    public static void main(String[] args) {
        test();
    }

    static void test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int curr = 0;

        for (Integer integer : list) {
            curr++;
        }
        Integer integer = list.get(curr);
        System.out.println(curr + "" + integer);
    }
}
