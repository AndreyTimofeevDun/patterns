import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Subscriber s11 = new Sub1();
        Subscriber s12 = new Sub1();
        Subscriber s21 = new Sub2();

        List<String> list = new ArrayList<>();
        list.add("petr");

        Publisher publisher = new Publisher(list);

        publisher.subscribe("petr", s21);
        publisher.subscribe("petr", s11);
        publisher.subscribe("petr", s12);

        publisher.notify("Semen");


    }
}
