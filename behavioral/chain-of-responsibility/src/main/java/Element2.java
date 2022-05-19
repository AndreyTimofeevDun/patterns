public class Element2 extends BaseElement{

    @Override
    public String check(int i) {
        if (i == 2) return "2";
        else return checkNext(i);
    }
}
