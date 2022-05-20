public class DataSource implements Data{
    private String data;

    public DataSource(String data){
        this.data = data;
    }

    @Override
    public void write(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        return this.data;
    }
}
