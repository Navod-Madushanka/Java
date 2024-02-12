package Example_3;

public class FIleSaveApp {
    public static void main(String[] args) {
        Context context = new Context(new PDF());
        System.out.println(context.saveFile("Hasitha"));
        context= new Context(new HTML());
        System.out.println(context.saveFile("Navod"));
        context = new Context(new TXT());
        System.out.println(context.saveFile("Madushanka"));
    }
}
