import org.junit.*;
import org.junit.runners.MethodSorters;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnnotationOrder {

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
    public void testc(){
        userRepository.addUser("Anton");
        Assert.assertEquals(7, userRepository.getUsers().size());

    }

    @Test
    public void testb(){
        userRepository.addUser("Igor");
        userRepository.addUser("Andrey");
        Assert.assertEquals(6, userRepository.getUsers().size());

    }

    @Test
    public void testa(){
        userRepository.addUser("Igor");
        Assert.assertEquals(4, userRepository.getUsers().size());
    }




}
