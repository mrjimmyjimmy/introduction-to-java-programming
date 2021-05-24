package ch11;

import java.util.ArrayList;

/**
 * @author jimmy xu
 * @date 2021/5/21 15:41
 */
public class MyStack <E> {
    private ArrayList<E> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public E pop() {
        E e = peek();
        list.remove(e);
        return e;
    }

    public void push(E e) {
        list.add(e);
    }
}
