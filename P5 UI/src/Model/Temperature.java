package Model;
//        Brad
  //      2019-09-06
    //    15:16

public interface Temperature {
    String CELSIUS_STRING = "°C";
    String KELVIN_STRING = "K";
    String FAHRENHEIT_STRING = "°F";
    double CELSIUS_TO_KELVIN = 273.15;

    double getCelsius();
    double getFahrenheit();
    double getKelvin();

    String toCelsiusString();
    String toFahrenheitString();
    String toKelvinString();
}

