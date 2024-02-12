package Example_2;

public abstract class CaffeineBeverages {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    public void boilWater(){
        System.out.println("Boiling");
    }
    public void pourInCup(){
        System.out.println("poured");
    }
    public boolean customerWantsCondiments(){
        return true;
    }
}
