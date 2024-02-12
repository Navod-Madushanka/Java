package Java_Consepts_Explanation;

public class MailService {
    public void sendEmail(){
        connect();
        authenticate();
        disconnect();
    }
    private void connect(){
        System.out.println("Connect");
    }
    private void disconnect(){
        System.out.println("Disconnect");
    }
    private void authenticate(){
        System.out.println("Authenticate");
    }
}
