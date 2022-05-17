public class SampleObject implements Clone{
    private String test;
    private Integer testInt;

    public SampleObject(){}

    public SampleObject(SampleObject object){
        if (object!=null){
            this.test = object.getTest();
            this.testInt = object.getTestInt();
        }
    }

    public Integer getTestInt() {
        return testInt;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }

    @Override
    public Clone clone() {
        return new SampleObject(this);
    }
}
