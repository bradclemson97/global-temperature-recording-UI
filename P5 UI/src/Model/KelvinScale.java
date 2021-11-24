package Model;



public class KelvinScale extends AbstractTemperatureScale {

    public KelvinScale (Model model) {
        this.model = model;
    }

    @Override

    public  String toString() {
        return "Kelvin";
    }

    @Override
    public void createTemperature() {
        model.add(new Kelvin(model.getInputValue()));
    }
}
