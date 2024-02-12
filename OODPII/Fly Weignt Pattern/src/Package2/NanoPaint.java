package Package2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Color{
    private int R;
    private int G;
    private int B;
    private static HashMap<List<Integer>, Color> POOL = new HashMap<>();
    private Color(){}
    public static Color createInstance(int R, int G, int B){
        ArrayList<Integer> key = new ArrayList<>();
        key.add(R);
        key.add(G);
        key.add(B);
        Color instance = POOL.get(key);
        if(instance==null){
            instance = new Color();
            instance.R = R;
            instance.G = G;
            instance.B = B;
            POOL.put(key, instance);
        }
        return instance;
    }

    public int getR() {
        return R;
    }

    public Color setColor(int R, int G, int B) {
        return Color.createInstance(R, G, B);
    }

    public int getG() {
        return G;
    }
    public int getB() {
        return B;
    }

}

public class NanoPaint {
    public static void main(String[] args) {
        Color color1 = Color.createInstance(101, 404, 501);
        Color color2 = Color.createInstance(101, 404, 501);
        color1 = color1.setColor(222, 345, 324);
        System.out.println(color1==color2);
    }
}
