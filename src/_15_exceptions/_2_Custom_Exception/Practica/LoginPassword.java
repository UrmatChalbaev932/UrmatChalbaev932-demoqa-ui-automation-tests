package _15_exceptions._2_Custom_Exception.Practica;

public class LoginPassword {
    public String login;
    public int password;

    public LoginPassword(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public void loginPasswordCheck(String login, int password) throws LoginException, PassportException {
        if (this.login.equals(login)) {
            if (this.password == password) {
                System.out.println("Welcome");

            } else {
                throw new PassportException("ErrorPassport");
            }
        } else {
            throw new LoginException("ErrorLogin");
        }
    }
}