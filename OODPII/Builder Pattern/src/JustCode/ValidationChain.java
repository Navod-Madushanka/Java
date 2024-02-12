package JustCode;

import java.util.regex.Pattern;

interface Validator{
    boolean validate(String input);
    void setNext(Validator next);
}
class UsernameValidator implements Validator{
    private Validator next;

    @Override
    public boolean validate(String input) {
        if(input != null && Pattern.matches("^[a-zA-Z0-9_-]{3,16}$", input)){
            System.out.println("Username is valid.");
            return true;
        }else {
            System.out.println("Invalid username");
            return false;
        }
    }

    @Override
    public void setNext(Validator next) {
        this.next = next;
    }
}
class EmailValidator implements Validator{
    private Validator next;

    @Override
    public boolean validate(String input) {
        if (input != null && Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", input)) {
            System.out.println("Email is valid.");
            return true;
        } else {
            System.out.println("Invalid email.");
            return false;
        }
    }

    @Override
    public void setNext(Validator next) {
        this.next = next;
    }
}
class PasswordValidator implements Validator{
    private Validator next;

    @Override
    public boolean validate(String input) {
        if (input != null && input.length() >= 8) {
            System.out.println("Password is valid.");
            return true;
        } else {
            System.out.println("Invalid password.");
            return false;
        }
    }

    @Override
    public void setNext(Validator next) {
        this.next = next;
    }
}

public class ValidationChain {
}
