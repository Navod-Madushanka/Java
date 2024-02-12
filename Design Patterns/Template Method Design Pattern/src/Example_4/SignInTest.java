package Example_4;

import java.util.Scanner;

public class SignInTest extends Test{
    @Override
    public void clearResources() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to clean SignIn resources? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("Cleaning SignIn resources...");
        }
        scanner.close();
    }

    @Override
    public void setTestEnvironment() {
        System.out.println("Setting Test Environment to SignIn Process...");
    }
}
