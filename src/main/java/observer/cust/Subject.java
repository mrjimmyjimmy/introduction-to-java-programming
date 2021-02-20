package observer.cust;

/**
 * @author jimmy xu
 * @date 2020/9/16 16:31
 */
public interface Subject {

    /**
     * 注册Observer
     * @param o 观察者
     */
    void register(Observer o);

    /**
     * 移除观察者
     * @param o 观察者
     */
    void remove(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
