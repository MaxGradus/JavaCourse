import org.testng.annotations.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class Test1 {

    @Test
    public void test1() {
        System.out.println("This is test 1");
    }

    @Test(dependsOnMethods = { "test1" })
    public void test2() {
        System.out.println("This is test 2");
    }

}
