package example_3;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Build wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build pillars with wood coating");
    }
}
