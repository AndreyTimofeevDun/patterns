import java.util.HashMap;
import java.util.Map;

public class ObjFactory {
    static Map<String, ObjectType> types = new HashMap<>();

    public static ObjectType getType(String name, String string){
        ObjectType type = types.get(name);
        if (type == null){
            type = new ObjectType(string);
            types.put(name, type);
        }
        return type;
    }
}
