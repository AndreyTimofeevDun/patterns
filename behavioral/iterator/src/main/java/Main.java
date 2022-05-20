import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("re");
        list.add("tr");
        list.add("pr");

        MyCollection a = new MyCollection(list);
        a.forEach();

    }
}
