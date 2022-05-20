import java.util.Locale;

public class CustomDecorator extends BaseDecorator{
    public CustomDecorator(Data wrapper) {
        super(wrapper);
    }

    @Override
    public void write(String data){
        super.write(data+data);
    }

    @Override
    public String read(){
        return someDataManipulations(super.read());
    }

    private String someDataManipulations(String data){
        return data.toUpperCase();
    }
}
