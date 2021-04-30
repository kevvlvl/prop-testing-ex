package prop.testing.ex1;

import java.util.ArrayList;
import java.util.List;

public class Calculation {

    /**
     * Sum two integers
     */
    public int getSum(int value1, int value2) {
        return value1 + value2;
    }

    /**
     * Sum all prime numbers for the numbers between lowerBound and upperBound
     */
    public int getSumPrimeNumbers(int lowerBound, int upperBound) {

        int sum = 0;

        for(int num = lowerBound; num <= upperBound; num++) {

            int divisibility = 0;
            for(int j = num; j > 0; j--) {

                if(num % j == 0) {
                    divisibility++;
                }
            }

            if(divisibility == 2) {
                sum += num;
            }
        }

        return sum;
    }

    /**
     * Sum all prime numbers for the numbers between lowerBound and upperBound, purposely introduce an inaccuracy to demonstrate property based testing
     */
    public int getSumPrimeNumbersWithError(int lowerBound, int upperBound) {
        return getSumPrimeNumbers(lowerBound, upperBound) + 1;
    }
}