

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
@RunWith(Theories.class)
public class TheoriesTest {

    @DataPoint
    public static String GOOD_USERNAME = "optimus";

    @DataPoint
    public static String USERNAME_WITH_SLASH = "optimus/prime";

    @Theory
    public void filenameIncludesUsername(String username) {
        System.out.println("username contains slash = " + username.contains("/"));
    }

    @Theory
    public void printString(String s) {
        System.out.println("s = " + s);
    }

}
