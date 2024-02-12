package Example_1;

public abstract class Template {
    public void p(){
        System.out.println("P");
    }
    abstract void p3();
    abstract void p2();
    public final void templateMethod(){
        p2();
        if(skip()){
            p();
        }
        p3();
    }
    public boolean skip(){
        return false;
    }
}
