public class CoffeeMachine {

    public Coffee makeCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            default:
                break;
        }
        coffee.makeCoffee();
        return coffee;
    }
}
