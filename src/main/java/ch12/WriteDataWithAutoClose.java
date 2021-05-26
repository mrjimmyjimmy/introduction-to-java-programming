package ch12;

import java.io.File;
import java.io.PrintWriter;

/**
 * @author jimmy xu
 * @date 2021/5/26 10:56
 */
public class WriteDataWithAutoClose {
    public static void main(String[] args) {
        File f = new File("scores.txt");
        if (f.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (PrintWriter os = new PrintWriter(f)) {
            os.print("john smith: ");
            os.println(90);
            os.print("eric jones: ");
            os.println(85);
        } catch (Exception e) {

        }
    }
}
