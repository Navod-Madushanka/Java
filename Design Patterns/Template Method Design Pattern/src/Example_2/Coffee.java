package Example_2;

import java.util.Scanner;

public class Coffee extends CaffeineBeverages{
    @Override
    void brew() {
        System.out.println("Dripping brew filter");
    }
    @Override
    void addCondiments() {
        System.out.println("add sager and milk");
    }
    @Override
    public boolean customerWantsCondiments() {
        String userInput = getUserInput();
        if(userInput.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }
    public String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to have some condiments with your tea? (Y/N)");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("n")){
            return "No";
        }
        return "Yes";
    }
}
