package Model;
//PACKAGE_NAME
  //      Brad
    //    2019-09-05
      //  17:00

import java.util.ArrayList;
import java.util.Collection;


public class Model {     //MAIN MODEL
    private ArrayList<TemperatureScale> temperatureScales = new ArrayList<TemperatureScale>();
    private ArrayList<Temperature> temperatures = new ArrayList<Temperature>();
    public ArrayList<Temperature> getTemperatures() {
        return temperatures;
    }
    public void add(Temperature temperature) {
        temperatures.add(temperature);
    }

    public ArrayList<TemperatureScale> getTemperatureScales() {
        return temperatureScales;
    }

    public Model() {
        temperatureScales.add(new CelsiusScale(this));
        temperatureScales.add(new FahrenheitScale(this));
        temperatureScales.add(new KelvinScale(this));
        regions.add(new Region("Africa", "", null));
        regions.add(new Region("Antarctica", "", null));
        regions.add(new Region("Asia", "", null));
        regions.add(new Region("Australia", "", null));
        regions.add(new Region("Europe", "", null));
        regions.add(new Region("North America", "", null));
        regions.add(new Region("South America", "", null));
    }

    public double inputValue = 0;
    public double getInputValue() {
        return inputValue;
    }

    private TemperatureScale inputScale;
    public TemperatureScale getInputScale() {
        return inputScale;
    }

    public void createRegionList() {
        //getInputScale().getNametxt.getText();
        //getInputScale().getDescriptiontxt.getText();
        getInputScale().createTemperature();
    }

    public void clearRegionList() {
        getTemperatures().clear();

    }

    //public void modifyRegionList() {
    //  getTemperatures().();


    public void setInputScale(Object selectedItem) {
        setInputScale((TemperatureScale) selectedItem);
    }

    public void setCurrentScale(Object selectedItem) {
        setCurrentScale((TemperatureScale) selectedItem);
    }

    private ArrayList<AbstractRegion> regions = new ArrayList<>();

    public ArrayList<AbstractRegion> getRegion() {
        return regions;
    }
}
