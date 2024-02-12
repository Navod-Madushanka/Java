package Example_4;

import java.util.Scanner;

public class LoginTest extends Test{
    @Override
    public void clearResources() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to clean Login resources? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("Cleaning Login resources...");
        }
        scanner.close();
    }

    @Override
    public void setTestEnvironment() {
        System.out.println("Setting the environment to the Login Page...");
    }
}
