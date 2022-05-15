public class AdapterImpl implements Adapter{
    private AirConditioning airConditioning = new AirConditioning();

    @Override
    public void setTemperature(String temperature) {
        this.airConditioning.setTemperature(Double.parseDouble(temperature));
    }

    @Override
    public String getTemperature() {
        return String.valueOf(this.airConditioning.getTemperature());
    }
}
