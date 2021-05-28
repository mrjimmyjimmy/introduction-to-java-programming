package ch13;

import java.util.*;

/**
 * @author jimmy xu
 * @date 2021/5/28 10:43
 */
public class TestCalendar {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            time();
        }
    }
    
    static void time() {
        Calendar calendar = new GregorianCalendar();
        System.out.println("current time is " + new Date());
        List<Integer> list = new ArrayList<>();
        list.add(calendar.get(Calendar.YEAR));
        list.add(calendar.get(Calendar.MONTH));
        list.add(calendar.get(Calendar.DATE));
        list.add(calendar.get(Calendar.HOUR));
//        list.add(calendar.get(Calendar.HOUR_OF_DAY));
        list.add(calendar.get(Calendar.MINUTE));
        list.add(calendar.get(Calendar.SECOND));
//        list.add(calendar.get(Calendar.YEAR));
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
