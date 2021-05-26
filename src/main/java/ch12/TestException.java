package ch12;

/**
 * @author jimmy xu
 * @date 2021/5/24 16:16
 */
public class TestException {

    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] {1,2,3,4,5}));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n" + e.getMessage());
            System.out.println("\n" + e.toString());

            System.out.println("\nTrace info obtained from getStackTrace");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.print("method " + stackTraceElement.getMethodName());
                System.out.print("( " + stackTraceElement.getClassName() + ":");
                System.out.println(stackTraceElement.getLineNumber() + ")");
            }
        }

    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++) {
            result += list[i];
        }
        return result;
    }
}
