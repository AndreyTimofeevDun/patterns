public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public AbstractProduct1 getA() {
        return new ProductA2();
    }

    @Override
    public AbstractProduct2 getB() {
        return new ProductB2();
    }
}
