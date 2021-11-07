package BasicJava;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExampleOfBigDecimal {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(i/3);
        System.out.println((double)i/3);

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePeople = rideFee.divide(amountOfPeople, RoundingMode.UP);
        System.out.println(chargePeople);

        double d = 3.1;
        double d1 = 1.2;
        System.out.println(d -d1); //1.89000000001
        BigDecimal db = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal db1 = BigDecimal.valueOf(1.21).setScale(2);
        BigDecimal res = db.subtract(db1);
        System.out.println(res); //1.89

    }
}
