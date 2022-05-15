public class Main {
    public static void main(String[] args) {
        StrategyImpl runner = new StrategyImpl();
        int a = 10;
        int b = 12;

        runner.setStrategy(new Sum());
        System.out.println(runner.run(a, b));

        runner.setStrategy(new Diff());
        System.out.println(runner.run(a, b));

    }
}
