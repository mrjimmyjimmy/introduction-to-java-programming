package ch11;

/**
 * @author jimmy xu
 * @date 2021/5/19 16:09
 */
public class Employee extends Person {

    public Employee() {
        this("2 invoke Employee's overload constructor");
        System.out.println("3 performs employee's tasks");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}
