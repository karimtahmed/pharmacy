
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Remon
 */
public class person {
    private String username;
    private String password;
    private String address;
    private String phonenumber;
    private String name;

    public person(String username, String password, String phonenumber, String address, String name) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.phonenumber = phonenumber;
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    

   

}
    