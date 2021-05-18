package ch10;

/**
 * @author jimmy xu
 * @date 2021/5/10 15:52
 */
public class TestBMI {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("xuzhe", 28, 65, 182);
        BMI bmi2 = new BMI("molly", 52, 165);
        exec(bmi1);
        exec(bmi2);
    }

    static void exec(BMI bmi) {
        System.out.printf("name: %s, bmi: %f, status: %s \n", bmi.name, bmi.getBMI(), bmi.getStatus());
    }
}
