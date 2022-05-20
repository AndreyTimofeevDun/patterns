public class ProxyImpl implements Proxy{
    private CustomObject object = new CustomObject();

    @Override
    public int sum(int x, int y) {
        return object.sum(x*x, y*y);
    }

    @Override
    public int dif(int x, int y) {
        return object.sum(x*x, y*y);
    }
}
