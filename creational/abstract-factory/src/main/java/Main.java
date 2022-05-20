public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new ConcreteFactory1());
        Client client2 = new Client(new ConcreteFactory2());

        client1.getProduct1().getA();
        client1.getProduct2().getB();

        client2.getProduct1().getA();
        client2.getProduct2().getB();


    }
}
