package accounts;

/**
 * UserProfile
 */
public class UserProfile {
    private final String login;
    private final String pass;

    public UserProfile(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public UserProfile(String login) {
        this.login = login;
        this.pass = login;
    }

    String getLogin() {
        return login;
    }

    String getPass() {
        return pass;
    }
}
