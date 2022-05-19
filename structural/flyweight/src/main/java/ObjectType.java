public class ObjectType {
    private String string;

    public ObjectType(String string){
        this.string = string;
    }

    public void printString(String s){
        System.out.println(this.string + " " + s);
    }
}
