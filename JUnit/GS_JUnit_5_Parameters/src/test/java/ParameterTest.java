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
public class ParameterTest {

    Calculator calculator = new Calculator();

    @Parameterized.Parameter(0)
    public int a;

    @Parameterized.Parameter(1)
    public int b;

    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {1, 1, 2}, {2, 1, 3}, {3, 2, 5}, {4, 3, 7}, {5, 5, 10}, {6, 8, 14}
        });
    }

    @Test
    public void testSum() {
        Assert.assertEquals(result, calculator.sum(a, b));
    }



}
