public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public AbstractProduct1 getA() {
        return new ProductA1();
    }

    @Override
    public AbstractProduct2 getB() {
        return new ProductB1();
    }
}
