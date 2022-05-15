public class Teacher {
    private String name;
    private boolean inClass;

    public Teacher(String name, boolean inClass){
        this.inClass = inClass;
        this.name = name;
    }

    public boolean isInClass() {
        return inClass;
    }

    public void setInClass(boolean inClass) {
        this.inClass = inClass;
    }

    public void activateTeacher(){
        String temp = " not";
        if (inClass) temp = "";
        System.out.println("Professor " + this.name + " is" + temp + " in class");
    }
}
