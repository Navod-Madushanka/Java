/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
interface OfficeInternet{
    public void getInternet();
}

class InternetAccess implements OfficeInternet{
    private String emp_name;

    public InternetAccess(String emp_name) {
        this.emp_name = emp_name;
    }
    
    @Override
    public void getInternet() {
        System.out.println("Permission Granted");
    }
}

class AccessProxy implements OfficeInternet{

    private String emp_name;
    private InternetAccess access;

    public AccessProxy(String emp_name) {
        this.emp_name = emp_name;
    }
    
    int getRoll(String emp_name){
        return 10;
    }
    
    @Override
    public void getInternet() {
        if(getRoll(emp_name) < 5){
            access = new InternetAccess(emp_name);
            access.getInternet();
        }else{
            System.out.println("You have no permission to access internet");
        }
    }
    
}

public class Proxy_Demo {
    public static void main(String[] args) {
        OfficeInternet ia = new AccessProxy("Navod");
        ia.getInternet();
    }
}
