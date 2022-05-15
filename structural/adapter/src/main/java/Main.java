public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println("temperature before: " + adapter.getTemperature());

        String temp = "21.5";
        adapter.setTemperature(temp);
        System.out.println("temperature before: " + adapter.getTemperature());
    }
}
