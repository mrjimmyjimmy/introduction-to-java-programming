package ch10;

/**
 * @author jimmy xu
 * @date 2021/5/18 10:55
 */
public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("P");
        course1.addStudent("K");
        course1.addStudent("A");
        course1.addStudent("D");

        course2.addStudent("P");
        course2.addStudent("S");

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(course1.getStudents()[i] + ", ");
        }
        System.out.println(course1.getNumberOfStudents());
        course1.dropStudent("P");

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(course1.getStudents()[i] + ", ");
        }
        System.out.println(course1.getNumberOfStudents());
    }
}
