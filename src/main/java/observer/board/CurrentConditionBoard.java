package observer.board;

import observer.cust.Subject;

/**
 * @author jimmy xu
 * @date 2020/9/16 17:06
 */
public class CurrentConditionBoard extends Board {


    public CurrentConditionBoard(Subject subject) {
        super(subject);
        this.name = "Current condition";
    }
}
