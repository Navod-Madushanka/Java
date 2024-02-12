package Example_1;

public class Stock {
    private String productName = "Apple iPhone 14";
    private int productQty = 20;
    public void buy(){
        System.out.println("product: "+productName+", Quantity: "+productQty+" Brought");
    }
    public void sell(){
        System.out.println("product: "+productName+", Quantity: "+productQty+" soled");
    }
}
