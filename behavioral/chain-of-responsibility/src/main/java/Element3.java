public class Element3 extends BaseElement{

    @Override
    public String check(int i) {
        if (i == 3) return "3";
        else return checkNext(i);
    }
}
