public class Main {
    public static void main(String[] args) {
        Proxy proxy = new ProxyImpl();
        System.out.println(proxy.dif(1,5));
        System.out.println(proxy.sum(2,3));
    }
}
