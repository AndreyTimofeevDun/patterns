import java.util.List;

public class MyCollection implements Iterator{
    public List<String> list;
    private int cursor = -1;
    public MyCollection(List<String> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        try {
            list.get(cursor+1);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public String getNext() throws Exception {
        if (this.hasNext()) {
            cursor++;
            return this.list.get(cursor);
        }
        else cursor = -1;
        return list.get(cursor);
    }

    @Override
    public void forEach() throws Exception {
        do {
            System.out.println(this.getNext());
        }while (this.hasNext());
    }
}
