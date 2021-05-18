package ch9;

/**
 * @author jimmy xu
 * @date 2021/4/15 16:36
 */
public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isScienceMajor=" + isScienceMajor +
                ", gender=" + gender +
                '}';
    }
}
