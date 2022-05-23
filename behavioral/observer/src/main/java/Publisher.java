import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {
    private Map<String, List<Subscriber>> map = new HashMap<>();

    public Publisher(List<String> list){
        list.forEach(e->map.put(e, new ArrayList<>()));
    }

    public Map<String, List<Subscriber>> get(){
        return this.map;
    }

    public void subscribe(String data, Subscriber subscriber){
        map.get(data).add(subscriber);
    }

    public void unsubscribe(String data, Subscriber subscriber){
        map.get(data).remove(subscriber);
    }

    public void notify(String state){
        map.forEach((k,v)->v.forEach(e->e.update(state)));
    }
}
