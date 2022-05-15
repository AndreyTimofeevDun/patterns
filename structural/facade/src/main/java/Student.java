public class Student {
    private String name;
    private boolean inClass;

    public Student(String name, boolean inClass){
        this.inClass = inClass;
        this.name = name;
    }

    public boolean isInClass() {
        return inClass;
    }

    public void setInClass(boolean inClass) {
        this.inClass = inClass;
    }

    public void activateStudent(){
        String temp = " not";
        if (inClass) temp = "";
        System.out.println("Student " + this.name + " is" + temp + " in class");
    }
}
