package gemini.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.Map;


@ManagedBean(name = "userinfo")
@RequestScoped
public class UserInfo {

    @ManagedProperty("#{param.username}")  //значения этих полей (userName, user) будут браться из параметров, которые получаем из index.xhtml (первый link)
    private String userName;
    private UserBean user;

    @PostConstruct
    public void  getUserInfo(){
        System.out.println("Get user info...");
        if (userName != null){
            user = Controller.getUserByName(userName);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }
}
