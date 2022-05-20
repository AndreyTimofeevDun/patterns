public class BaseDecorator implements Data{
    private Data wrapper;

    public BaseDecorator(Data wrapper){
        this.wrapper = wrapper;
    }

    @Override
    public void write(String data) {
        wrapper.write(data);
    }

    @Override
    public String read() {
        return wrapper.read();
    }
}
