package observer.cust;

/**
 * @author jimmy xu
 * @date 2020/9/16 16:31
 */
public interface Observer {

    /**
     * 更新天气信息
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(double temp, double humidity, double pressure);
}
