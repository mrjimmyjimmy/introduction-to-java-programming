package ch12;

import java.io.File;
import java.util.Scanner;

/**
 * @author jimmy xu
 * @date 2021/5/26 14:20
 */
public class ReadData {
    public static void main(String[] args) {
        File f = new File("scores.txt");

        try (Scanner in = new Scanner(f)) {
            while (in.hasNext()) {
                String firstName = in.next();
                String lastName = in.next();
                int score = in.nextInt();
                System.out.println(firstName + lastName + score);
            }
        } catch (Exception ignored) {

        }
    }
}
