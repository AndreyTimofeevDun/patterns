public class CustomObject implements Proxy{
    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int dif(int x, int y) {
        return x-y;
    }
}
