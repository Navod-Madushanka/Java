package Package1;

import java.util.ArrayList;
import java.util.List;
abstract class Component{
    protected String name;
    protected double size;
    public Component(String name, double size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public abstract double getSize();
}

class File extends Component{
    public File(String name, double size) {
        super(name,size);
    }

    @Override
    public double getSize() {
        return size;
    }
}
class Folder extends Component{
   List<Component> components = new ArrayList<>();
    public Folder(String name, double size) {
        super(name, size);
    }
    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public double getSize() {
        double totalSize = 0;
        for(Component component: components){
            totalSize +=component.getSize();
        }
        return totalSize;
    }
}
public class Test {
    public static void main(String[] args) {
        File f1 = new File("A.txt", 2);
        File f2 = new File("B.txt", 1);
        File f3 = new File("C.txt", 10);
        File f4 = new File("D.txt", 3);

        Folder fo1 = new Folder("Folder1", 0);
        Folder fo2 = new Folder("Folder2", 0);
        Folder fo3 = new Folder("Folder3", 0);

        fo2.addComponent(f1);
        fo2.addComponent(f2);
        fo2.addComponent(fo1);

        fo1.addComponent(f3);
        fo1.addComponent(fo3);

        fo3.addComponent(f4);
        System.out.println(fo2.getSize());
    }
}
