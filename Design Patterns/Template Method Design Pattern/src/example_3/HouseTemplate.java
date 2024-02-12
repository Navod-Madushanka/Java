package example_3;

public abstract class HouseTemplate {
    private void buildWindows(){
        System.out.println("Building glass windows");
    }
    private void buildFoundation(){
        System.out.println("Building foundation with cement, iran rods and sand");
    }
    public abstract void buildWalls();
    public abstract void buildPillars();
    public final void houseBuild(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

}
