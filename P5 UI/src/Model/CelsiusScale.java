package Model;



public class CelsiusScale extends AbstractTemperatureScale {

    public CelsiusScale(Model model) {
        this.model = model;
    }

    @Override

    public  String toString() {
        return "Celsius";
    }

    @Override
    public void createTemperature() {
        model.add(new Celsius(model.getInputValue()));
    }
}