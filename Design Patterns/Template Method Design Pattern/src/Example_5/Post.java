package Example_5;

import java.util.Scanner;

public abstract class Post {
    public void createPost(){
        postType();
        System.out.println("Post Initializing....");
        choosingMediaFile();
        addCaption();
        addFilters();
        tagFriends();
        System.out.println("New Post is created.");
    }
    public abstract void postType();
    public void choosingMediaFile(){
        System.out.println("Choosing Media File....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File is Chosen");
    }
    public void addCaption(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to put a Caption? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            scanner = new Scanner(System.in);
            System.out.println("Type Your Caption here...");
            String caption = scanner.nextLine();
            System.out.println("caption is added. Your caption is: "+caption);
        }else{
            System.out.println("Caption is not added..");
        }
        scanner.close();
    }
    public void addFilters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you Want to add Filters? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("Adding Filters....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Filter is added..");
        }else{
            System.out.println("No filters Added!");
        }
        scanner.close();
    }
    public void tagFriends(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to tag friends? (y/n)");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.println("Tagging....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tagging complete");
        }else{
            System.out.println("No filters Added!");
        }
        scanner.close();
    }
}
