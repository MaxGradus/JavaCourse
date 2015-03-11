import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class AnnotationTimeout {

    Calculator calculator = new Calculator();

    @Test(timeout = 100)
    public void timeout1(){
        Assert.assertEquals(10,  calculator.sum(5,5));
    }

    @Test(timeout = 3000)
    public void timeout2(){
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(11,  calculator.sum(5,10));
    }


}
