package ch10;

/**
 * @author jimmy xu
 * @date 2021/5/8 15:55
 */
public class TestLoan {
    public static void main(String[] args) {

        System.out.println("==========================================================================================================");
        System.out.println("房贷计算器：有以下前提");
        System.out.println("    1. 所有楼盘均算上车位50W");
        System.out.println("    2. 贷款利率5.2% 30年");
        System.out.println("    3. 默认公积金贷款50W，福宝公积金每月帮助2000");
        System.out.println("    4. 买房已有现款340万，首付之外的现款，按公司理财9%计算");
        System.out.println("==========================================================================================================");

        Property p1 = new Property("丹枫四季", 4.8, 165);
        Property p2 = new Property("保利天汇", 5, 130);
        Property p3 = new Property("华润亚运村", 4.7, 123);
        Property p4 = new Property("滨江，星璀澜庭", 4.5, 140);
        Property p5 = new Property("滨江，博宇华庭", 3.4, 121);
        Property p6 = new Property("不买", 5, -10);

        p1.getLoan();
        p2.getLoan();
        p3.getLoan();
        p4.getLoan();
        p5.getLoan();
        p6.getLoan();
    }


}
