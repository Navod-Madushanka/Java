
package Ex_1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("VEGA");
        System.out.println(cars);
        System.out.println(cars.get(3));
        Collections.sort(cars);
        for(String i: cars){
            System.out.println(i);
        }
    }
}
