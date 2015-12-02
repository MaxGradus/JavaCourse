package gemini.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "user") /*можно указать атрибут eager, который указывает когда создавать бин (по умочанию lazy - при обращении к бину)*/
@SessionScoped
public class UserBean implements Serializable {

    private String name;
    private String password;

    @ManagedProperty(value = "#{address}") // выставляем аннотацию, чтобы было ясно что это тоже бин
    private AddressBean address;

    @PostConstruct
    public void initAddress() {
        address.setCity("Saint-Petersburg");
        address.setStreet("Nevsky pr");
        address.setBuilding(10);

    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String newValue) {
        password = newValue;
    }


    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public String showAddress() {
        return address.getCity() + " " + address.getStreet() + " " + address.getBuilding();
    }
}
