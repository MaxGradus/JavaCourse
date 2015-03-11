import org.junit.*;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class AnnotationBeforeAfter {

    UserRepository userRepository = new UserRepository();

    @Before
    public void initUserRepository() {
        userRepository.addUser("Vova");
        userRepository.addUser("Ivan");
        userRepository.addUser("Petr");
        System.out.println("@Before userRepository size = " + userRepository.getUsers().size());
    }

    @After
    public void clearUsersRepository() {
        userRepository.getUsers().clear();
        System.out.println("@After userRepository size = " + userRepository.getUsers().size());
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
        Assert.assertEquals(5, userRepository.getUsers().size());

    }


}
