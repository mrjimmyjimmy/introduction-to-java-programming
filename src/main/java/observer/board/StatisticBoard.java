package observer.board;

import observer.cust.Subject;

/**
 * @author jimmy xu
 * @date 2020/9/17 9:50
 */
public class StatisticBoard extends Board {

    public StatisticBoard(Subject subject) {
        super(subject);
        this.name = "Statistic ";
    }
}
