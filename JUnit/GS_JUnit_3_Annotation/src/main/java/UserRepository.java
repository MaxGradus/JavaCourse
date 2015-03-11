import java.util.ArrayList;
import java.util.List;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class UserRepository {

    List<String> users = new ArrayList<String>();

    public List<String> getUsers() {
        return users;
    }

    public void addUser(String user) {
        users.add(user);
    }
}
