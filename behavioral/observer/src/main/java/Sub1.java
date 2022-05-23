public class Sub1 implements Subscriber{
    private final String sub1 = "sub1: ";
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println(sub1 + state);
    }
}
