package observer.board;

import observer.cust.Subject;

/**
 * @author jimmy xu
 * @date 2020/9/17 9:51
 */
public class ForecastBoard extends Board {


    public ForecastBoard(Subject subject) {
        super(subject);
        this.name = "forecast ";
    }
}
