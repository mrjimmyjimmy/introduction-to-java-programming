package ch11;

/**
 * @author jimmy xu
 * @date 2021/5/19 16:46
 */
public class ExtendsInstanceTest {

    private String baseName = "base";

    public ExtendsInstanceTest() {
        System.out.println(this.getClass().toString());
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends ExtendsInstanceTest {
        private String baseName = "sub";

        @Override
        public void callName() {
            System.out.println(baseName);
        }
    }

    static class TwoSub extends Sub {
        private String baseName = "two_sub";
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new TwoSub();
        new Sub();
    }
}
