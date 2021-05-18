package ch10;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author jimmy xu
 * @date 2021/5/18 10:44
 */
public class Course {
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < getNumberOfStudents(); i++) {
            if (student.equals(students[i])) {
                numberOfStudents--;
                for (int j = i; j < getNumberOfStudents(); j++) {
                    students[j] = students[j + 1];
                }
                return;
            }
        }
    }
}
