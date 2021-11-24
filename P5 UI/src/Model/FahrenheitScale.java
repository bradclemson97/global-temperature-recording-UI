package Model;


public class FahrenheitScale extends AbstractTemperatureScale {

    public FahrenheitScale (Model model) {
        this.model = model;
    }

    @Override

    public  String toString() {
        return "Fahrenheit";
    }

    @Override
    public void createTemperature() {
        model.add(new Fahrenheit(model.getInputValue()));

    }
}