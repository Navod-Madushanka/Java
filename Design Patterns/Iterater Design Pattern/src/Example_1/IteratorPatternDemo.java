package Example_1;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameReader nameReader = new NameReader();
        for(Iterator iterator = nameReader.getIterator(); iterator.hasNext();){
            String next = (String) iterator.next();
            System.out.println(next);
        }
    }
}
