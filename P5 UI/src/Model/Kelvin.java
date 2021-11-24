package Model;




public class Kelvin implements Temperature {
    private double temperature;

    public Kelvin (double pTemperature) {
        temperature = pTemperature;
    }

    public double getCelsius() {
        return temperature - CELSIUS_TO_KELVIN;
    }

    public double getFahrenheit() {
        return temperature * 9.0 / 5/0 - 459.67;
    }

    public double getKelvin() {
        return temperature;
    }


    @Override

    public String toString() {
        return toKelvinString();
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