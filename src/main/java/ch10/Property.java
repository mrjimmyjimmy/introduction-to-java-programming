package ch10;

/**
 * @author jimmy xu
 * @date 2021/5/8 16:35
 */
public class Property {

    static final double start = 460;
    static final double gong = 4144;

    public String name;
    public double price;
    public int area;
    public double total;
    public double first;
    public double remain;

    public Property() {
    }

    public Property(String name, double price, int area) {
        this.name = name;
        this.price = price;
        this.area = area;
        total = area * price + 50;
        first = total * 0.3;
        remain = total * 0.7;
    }

    public void getLoan() {
        Loan loan = new Loan(5.2, 30, (remain - 50) * 10000);
        int p = (int) loan.getMonthlyPayment();
        int f =(int) (p - (start - first) * 75 - gong);
        System.out.println(this.toString());
        System.out.println("原本商业贷为：" + p + " ; 扣除公司套利和公积金还款后房贷为：" + f);
        System.out.println("\n");
    }

    @Override
    public String toString() {
        int t = (int) total;
        int f = (int) first;
        int r = (int) remain;
        return "房产{" +
                "楼盘='" + name + '\'' +
                ", 单价=" + price +
                ", 面积=" + area +
                ", 总价=" + t +
                ", 首付=" + f +
                ", 贷款=" + r +
                '}';
    }
}
