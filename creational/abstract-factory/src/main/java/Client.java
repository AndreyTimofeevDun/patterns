public class Client {
    private AbstractProduct1 product1;
    private AbstractProduct2 product2;

    Client (AbstractFactory factory){
        product1 = factory.getA();
        product2 = factory.getB();
    }

    public AbstractProduct1 getProduct1() {
        return product1;
    }

    public AbstractProduct2 getProduct2() {
        return product2;
    }
}
