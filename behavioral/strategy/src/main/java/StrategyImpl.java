public class StrategyImpl {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int run(int a, int b){
        return this.strategy.execute(a, b);
    }
}
