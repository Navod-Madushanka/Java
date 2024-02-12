package example_3;

public class GlassHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build pillars with glass coating");
    }
}
