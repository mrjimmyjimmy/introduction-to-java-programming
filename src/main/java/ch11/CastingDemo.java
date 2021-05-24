package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jimmy xu
 * @date 2021/5/21 14:03
 */
public class CastingDemo {
    public static void main(String[] args) {
        Object o1 = new Circle("red", false, 1.0);
        Object o2 = new Rectangle();
        displayObject(o1);
        displayObject(o2);
        boolean equals = o1.equals(o2);

        int a1 = 45;
        double a2 = 45.0;
        byte a3 = (byte) a1;
        byte a4 = (byte) a2;
        System.out.println(equals);
        System.out.println(a4);

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("sdas");
        cityList.add("Denxzcver");
        cityList.add("Denrgsdver");
        cityList.add("xcvaf");
        cityList.get(2);
        System.out.println(cityList.toString());
        String[] array = {"red", "sda", "sdsd", "aa1", "a1"};
        List<String> list = Arrays.asList(array);
        Object[] objects = list.toArray();
        Collections.sort(list);
        System.out.println(list.toString());

        Integer[] da = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(da));
        for (int i = 0; i < 10; i++) {
            java.util.Collections.shuffle(l1);
            System.out.println(l1);
        }

    }

    private static void displayObject(Object o) {
        if (o instanceof Circle) System.out.println("circle");
        if (o instanceof Rectangle) System.out.println("rectangle");
    }
}
