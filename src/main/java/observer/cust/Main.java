package observer.cust;

import observer.board.Board;
import observer.board.CurrentConditionBoard;
import observer.board.ForecastBoard;
import observer.board.StatisticBoard;

/**
 * @author jimmy xu
 * @date 2020/9/16 17:01
 */
public class Main {

    public static void main(String[] args) {

//        // 获取weatherData对象
//        WeatherData weatherData = WeatherData.WEATHER_DATA;
//
//        // 实例化三个board
//        Board currentConditionBoard = new CurrentConditionBoard(weatherData);
//        Board statisticsBoard = new StatisticBoard(weatherData);
//        Board forecastBoard = new ForecastBoard(weatherData);
//
//        // 手动更新消息
//        weatherData.setMeasurements(1,2,3);
        int i = Integer.MAX_VALUE;
        long k = 16871111703L;
        int j = (int) (k - i);
        System.out.println(j);
    }
}
