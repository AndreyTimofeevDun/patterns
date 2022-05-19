public class Main {
    public static void main(String[] args) {
        BaseElement element1 = new Element1();
        BaseElement element2 = new Element2();
        BaseElement element3 = new Element3();

        element1.setNext(element2);
        element2.setNext(element3);


        System.out.println(element1.check(1));
        System.out.println(element1.check(2));
        System.out.println(element1.check(3));
        System.out.println(element1.check(4));
    }
}
