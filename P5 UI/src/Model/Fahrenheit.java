package Model;


public class Fahrenheit implements Temperature {
    private double temperature;

    public Fahrenheit(double pTemperature) {
        temperature = pTemperature;
    }

    public double getCelsius() {
        return (temperature - 32.0) / 1.8;
    }

    public double getFahrenheit() {
        return temperature;
    }

    public double getKelvin() {
        return getCelsius() + 273.15;
    }

    @Override
    public String toString() {
        return toFahrenheitString();
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

