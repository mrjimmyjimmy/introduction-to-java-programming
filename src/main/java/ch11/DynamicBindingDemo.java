package ch11;

/**
 * @author jimmy xu
 * @date 2021/5/21 10:55
 */
public class DynamicBindingDemo {
    public static void main(String[] args) {
        DynamicBindingDemo d = new DynamicBindingDemo();
        m(d.new GraduateStudent());
        m(d.new Student());
        m(d.new Person());
        new Circle(null, false, 1.0);
//        new Circle(null, false, 1.0);
        m(new Object());
        m(new Object());
    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }

    class GraduateStudent extends Student {

    }

    class Student extends Person {
        @Override
        public String toString() {
            return "Student{}";
        }
    }

    class Person extends Object {
        @Override
        public String toString() {
            return "Person{}";
        }
    }
}
