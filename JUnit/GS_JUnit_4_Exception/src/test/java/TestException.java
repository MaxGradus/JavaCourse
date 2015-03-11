import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class TestException {

    UserRepository userRepository = new UserRepository();


    @Test(expected = IndexOutOfBoundsException.class)
    public void printFirstUser() {
        System.out.println("first user = " + userRepository.getUsers().get(0));
    }

    @Test(expected = NullPointerException.class)
    public void printSecondUser() {
        userRepository = null;
        System.out.println("first user = " + userRepository.getUsers().get(0));
    }

    @Test(expected = ArithmeticException.class)
    public void div() {
        Calculator calculator = new Calculator();
        System.out.println("result = " + calculator.div(10, 0));
    }

    @Test
    public void failTest() {

        int a = 2;
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.div(4, a));
        Assert.fail();  // FAIL when you expect exception but no exception is thrown

    }

}
