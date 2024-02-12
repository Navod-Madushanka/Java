interface OrderHandler{
    void handleOrder(FoodOrder foodOrder);
    void setNextHandler(OrderHandler nextHandler);
}
class AcceptingStepHandler implements OrderHandler{
    private OrderHandler nextHandler;
    @Override
    public void handleOrder(FoodOrder foodOrder) {
        System.out.println("Accepting step: Order accepted");
        if (nextHandler != null) {
            nextHandler.handleOrder(foodOrder);
        }
    }

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
class CookingStepHandler implements OrderHandler {
    private OrderHandler nextHandler;
    @Override
    public void handleOrder(FoodOrder foodOrder) {
        System.out.println("Cooking step: Order cooked");
        if (nextHandler != null) {
            nextHandler.handleOrder(foodOrder);
        }
    }

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
class PackingStepHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void handleOrder(FoodOrder foodOrder) {
        System.out.println("Packing step: Order packed");
        if (nextHandler != null) {
            nextHandler.handleOrder(foodOrder);
        }
    }

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
class HandOverStepHandler implements OrderHandler {
    @Override
    public void handleOrder(FoodOrder foodOrder) {
        System.out.println("Handover step: Order handed over to the driver");
    }

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        // This is the last step, no need to set next handler
    }
}
