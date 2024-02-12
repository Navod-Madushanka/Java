/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;
import java.util.regex.Pattern;
import Entity.User;

/**
 *
 * @author Navod Madusanka
 */
interface Vwihqi{
    boolean ekwqd(String input);
    void setN(Vwihqi next);
}
class Validator1 implements Vwihqi{
    private Vwihqi next;

    @Override
    public boolean ekwqd(String input) {
        if(input != null && Pattern.matches("^[a-zA-Z0-9_-]{3,16}$", input)){
            System.out.println("Username is valid.");
            return true;
        }else {
            System.out.println("Invalid username");
            return false;
        }
    }

    @Override
    public void setN(Vwihqi next) {
        this.next = next;
    }
}
class Validator2 implements Vwihqi{
    private Vwihqi next;

    @Override
    public boolean ekwqd(String input) {
        if (input != null && Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", input)) {
            System.out.println("Email is valid.");
            return true;
        } else {
            System.out.println("Invalid email.");
            return false;
        }
    }

    @Override
    public void setN(Vwihqi next) {
        this.next = next;
    }
}
class Validator3 implements Vwihqi{
    private Vwihqi next;

    @Override
    public boolean ekwqd(String input) {
        if (input != null && input.length() >= 8) {
            System.out.println("Password is valid.");
            return true;
        } else {
            System.out.println("Invalid password.");
            return false;
        }
    }

    @Override
    public void setN(Vwihqi next) {
        this.next = next;
    }
}
public class ValidationChain {
    public boolean Validate(User user){
        Vwihqi usernameValidator = new Validator1();
        Vwihqi emailValidator = new Validator2();
        Vwihqi passwordValidator = new Validator3();
        
        usernameValidator.setN(emailValidator);
        emailValidator.setN(passwordValidator);
        
        if(usernameValidator.ekwqd(user.getUsername()) && 
                emailValidator.ekwqd(user.getEmail()) && 
                passwordValidator.ekwqd(user.getPassword())){
            return true;
        }else{
            return false;
        }

    }
}
