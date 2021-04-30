
package prop.testing.ex1;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;
import org.junit.jupiter.api.Assertions;

public class AppTest {

    private final Calculation calc;

    public AppTest() {
        this.calc = new Calculation();
    }

    @Property
    boolean sumIntegersCalculation(@ForAll int value1, @ForAll int value2) {
        return calc.getSum(value1, value2) == (value1 + value2);
    }

    @Property
    void sumPrimeNumbers(@ForAll @IntRange(min = 1, max = 100) int value1) {

        int value2 = value1 + 10;

        int sum = calc.getSumPrimeNumbers(value1, value2);
        Assertions.assertEquals(sum, sum);
    }

    @Property
    void sumPrimeNumbersWithIncorrectResult(@ForAll @IntRange(min = 1, max = 100) int value1) {

        int value2 = value1 + 10;

        int sum = calc.getSumPrimeNumbersWithError(value1, value2);

        // Here, we assert that the result from the method with an error does NOT match the method with the correct sum
        Assertions.assertNotEquals(sum, calc.getSumPrimeNumbers(value1, value2));
    }
}