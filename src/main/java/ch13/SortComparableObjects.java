package ch13;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author jimmy xu
 * @date 2021/5/31 10:17
 */
public class SortComparableObjects {

    public static void main(String[] args) throws CloneNotSupportedException {
        String[] cities = {"Savannah", "Boston", "boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),new BigInteger("432232323239292"),new BigInteger("54623239292")};
        Arrays.sort(hugeNumbers);
        for (BigInteger hugeNumber : hugeNumbers) {
            System.out.print(hugeNumber + " ");
        }
        System.out.println();

        House h1 = new House(1, 1750.50);
        House h2 = (House) h1.clone();
        System.out.println(h1.getWhenBuilt() == h2.getWhenBuilt());
    }
}
