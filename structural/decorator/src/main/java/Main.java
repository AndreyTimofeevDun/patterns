public class Main {
    public static void main(String[] args) {
        String data = "how to cakac";
        BaseDecorator decorator = new BaseDecorator(new CustomDecorator(new VeryCustomDecorator(new DataSource(data))));
        System.out.println(decorator.read());
    }
}
