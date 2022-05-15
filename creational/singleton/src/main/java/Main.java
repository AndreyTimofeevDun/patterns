public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setState(false);

        Singleton s2 = Singleton.getInstance();
        s2.setState(true);

        System.out.println(s1.isState());
        System.out.println(s2.isState());
    }
}
