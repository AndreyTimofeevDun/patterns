public abstract class BaseElement {
    private BaseElement next;

    public BaseElement setNext(BaseElement next) {
        this.next = next;
        return next;
    }

    public abstract String check(int i);

    public String checkNext(int i){
        if (next==null) return "notfound";
        return next.check(i);
    }
}
