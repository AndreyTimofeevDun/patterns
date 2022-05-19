import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<CustomObject> list = new ArrayList<>();

    public void add(int i, String string, String name){
        ObjectType type = ObjFactory.getType(name, string);
        CustomObject object = new CustomObject(i);
        list.add(object);
    }

    public void print(){
        list.forEach(CustomObject::print);
    }
}
