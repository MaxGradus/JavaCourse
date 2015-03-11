import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
@RunWith(Parameterized.class)
public class ParametersTest {

    Calculator calculator = new Calculator();

    int a;
    int b;
    int result;

    @Parameterized.Parameters(name = "{index}: sum({0})={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {1, 1, 2}, {2, 1, 3}, {3, 2, 5}, {4, 3, 7}, {5, 5, 10}, {6, 8, 14}
        });
    }

    public ParametersTest(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Test
    public void testSum() {
        Assert.assertEquals(result, calculator.sum(a, b));
    }



}
