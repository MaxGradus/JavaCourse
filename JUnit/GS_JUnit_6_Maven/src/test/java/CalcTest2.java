import org.junit.Assert;
import org.junit.Test;
import ru.javacourse.Calculator;

/**
 * Created by Georgy Gobozov on 11.01.2015.
 */

public class CalcTest2 {


    Calculator calculator = new Calculator();

    @Test
    public void testSub() {
        int result = calculator.sub(3, 2);
        Assert.assertEquals(1, result);
    }

}
