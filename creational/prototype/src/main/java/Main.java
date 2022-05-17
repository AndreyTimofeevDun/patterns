public class Main {
    public static void main(String[] args) {
        SampleObject object = new SampleObject();
        object.setTest("nan");
        object.setTestInt(12);

        SampleObject object1 = (SampleObject) object.clone();

        System.out.println(object.getTest());
        System.out.println(object1.getTest());
    }
}
