import org.junit.Assert;
import org.junit.Test;
import ru.javacourse.Calculator;


public class CalcTest2 {


    Calculator calculator = new Calculator();

    @Test
    public void testSub() {
        int result = calculator.sub(3, 2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMult() {
        int result = calculator.mult(15, 3);
        Assert.assertEquals(25, result);
    }


}
