public class VeryCustomDecorator extends BaseDecorator{
    public VeryCustomDecorator(Data wrapper) {
        super(wrapper);
    }

    @Override
    public void write(String data) {
        super.write(unspace(data));
    }

    @Override
    public String read() {
        return space(super.read());
    }

    private String space(String data){
        return data.replace("", " ").trim();
    }

    private String unspace(String data){
        return data.replace(" ", "").trim();
    }
}
