import java.util.ArrayList;

public class User {
    //The user's first name
    private String firstName;

    //The user's last name
    private String lastName;

    //THe id number of the user
    private String uuid;

    //the MD5 hash of user's pin number
    private byte pinHash[];

    //the list of accounts for this user
    private ArrayList<Account> accounts;
}
