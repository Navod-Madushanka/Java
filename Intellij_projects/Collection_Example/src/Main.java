import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Person person1 = new Person("Person-1", 22);
        Person person2 = new Person("Person-2", 23);

        if(person1.equals(person2)){
            System.out.println("They are equals");
        }

        Map<Person, String> personMap = new HashMap<>();
        personMap.put(person1, "Manager");
        personMap.put(person2, "Engineer");
        System.out.println(personMap.size());
    }
}

