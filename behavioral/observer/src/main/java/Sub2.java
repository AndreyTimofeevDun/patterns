public class Sub2 implements Subscriber{

    private final String sub2 = "sub2: ";
    private String state;

    @Override
    public void update(String state) {
        this.state = state;
        System.out.println(sub2 + state);
    }
}