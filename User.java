import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;

public class User
{
    private String user;
    private String firstLastName;
    private String url;
    private String email;
    static Scanner keyboard = new Scanner(System.in);
    private int userID;
    public String getUserInfo()
    {
        return user + "\n" + firstLastName + "\n" + url + "\n" + email;
    }
    User(String userName, String personName, String urlPic, String emailAddress)
    {
        this.user = userName;
        this.firstLastName = personName;
        this.url = urlPic;
        this.email = emailAddress;

    }







}