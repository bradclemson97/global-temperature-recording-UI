package Model;
//        Brad
  //      2019-09-06
    //    15:15

public class Celsius implements Temperature {
    private double temperature;

    public Celsius(double pTemperature) {
        temperature = pTemperature;
    }

    public double getCelsius() {
        return temperature;
    }

    public double getFahrenheit() {
        return temperature * 1.8 + 32;
    }

    public double getKelvin() {
        return temperature + 273.15;
    }

    @Override
    public String toString() {
        return toCelsiusString();
    }

    public String toCelsiusString() {
        return getCelsius() + CELSIUS_STRING;
    }

    public String toFahrenheitString() {
        return  getFahrenheit() + FAHRENHEIT_STRING;
    }

    public String toKelvinString() {
        return getKelvin() + KELVIN_STRING;
    }

}
