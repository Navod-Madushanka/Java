package example_3;

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new GlassHouse();
        houseType.houseBuild();
        System.out.println("**************************");
        houseType = new WoodenHouse();
        houseType.houseBuild();
    }
}
