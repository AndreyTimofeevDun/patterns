public class Element1 extends BaseElement{

    @Override
    public String check(int i) {
        if (i == 1) return "1";
        else return checkNext(i);
    }
}
