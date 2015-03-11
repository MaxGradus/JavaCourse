import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class AnnotationIgnore {

    Calculator calculator = new Calculator();

    @Test
    public void simpleTest(){
        Assert.assertEquals(10,  calculator.sum(5,5));
    }

    @Test
    @Ignore
    public void ignoredTest(){
        Assert.assertEquals(11,  calculator.sum(5,10));
    }


}
