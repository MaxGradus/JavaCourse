import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class AnnotationBeforeAfterClass {

   static DatabaseConnection databaseConnection;
    static UserRepository userRepository;

    @BeforeClass
    public static void initUserRepository() {
        System.out.println("@BeforeClass get Database connection");
        databaseConnection = DatabaseConnection.getConnection();
        userRepository = databaseConnection.getUserRepository();
    }

    @AfterClass
    public static void clearUsersRepository() {
        System.out.println("@BeforeClass release Database connection");
        databaseConnection = null;
    }


    @Test
    public void test1(){
        userRepository.addUser("Igor");
        Assert.assertEquals(4, userRepository.getUsers().size());
    }

    @Test
    public void test2(){
        userRepository.addUser("Igor");
        userRepository.addUser("Andrey");
        Assert.assertEquals(6, userRepository.getUsers().size());

    }


}
