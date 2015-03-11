/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getConnection(){
        if (instance == null)
            instance = new DatabaseConnection();
        return instance;
    }

    public UserRepository getUserRepository() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser("Vova");
        userRepository.addUser("Ivan");
        userRepository.addUser("Petr");
        return userRepository;
    }

}
