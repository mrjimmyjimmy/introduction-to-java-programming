package ch10;

/**
 * @author jimmy xu
 * @date 2021/5/18 13:42
 */
public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            int i = stack.pop();
            System.out.println(i);
        }
    }
}
