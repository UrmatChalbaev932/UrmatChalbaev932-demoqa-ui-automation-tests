package _15_exceptions._2_Custom_Exception.Practica;

public class Test {
    public static void main(String[] args) throws LoginException, PassportException{
        LoginPassword loginPassword = new LoginPassword("A",1);
        loginPassword.loginPasswordCheck("A",1);
        System.out.println("End!");
    }
}
