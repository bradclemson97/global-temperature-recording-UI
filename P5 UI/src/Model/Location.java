package Model;

import java.util.Objects;



/**
 * creating a delegating method pulling in longitude and latitude
 */
public class Location extends AbstractRegion{
    /**
     *
     */
    private String street;
    private String city;
    private String country;
    private String tempScale;
    private Latitude latitude;
    private Longitude longitude;


    Location(String name, String description, Region parent, Latitude latitude,
             Longitude longitude,
             String street, String city, String country, String postcode,
             String tempScale) {
        super(name, description, parent);
        this.street = street;
        this.city = city;
        this.country = country;
        this.tempScale = tempScale;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Getter method, this method works by returning the value to the caller
     * @return Street
     */
    public String getStreet() {
        return street;
    }


    public boolean setStreet(String street, ErrorMessage Error) {
        if (exists("Street", street, Error)) {
            this.street = street;
            return true;
        }
        return false;
    }


    public String getCity() {
        return city;
    }


    public boolean setCity(String city, ErrorMessage Error) {
        if (exists("City", city, Error)) {
            this.city = city;
            return true;
        }
        return false;
    }


    public String getCountry() {
        return country;
    }

    public boolean setCountry(String country, ErrorMessage Error) {
        if (exists("Country", country, Error)) {
            this.country = country;
            return true;
        }
        return false;
    }


    public String getTemperatureScale() {
        return tempScale;
    }


    public boolean setTempScale(String tempScale, ErrorMessage Error) {
        if (exists("TempScale", tempScale, Error)) {
            this.tempScale = tempScale;
            return true;
        }
        return false;
    }


    public Latitude getLatitude() {
        return latitude;
    }


    public boolean setLatitude(double degrees, ErrorMessage Error) {
        if (exists(0, degrees, Error)) {
            this.latitude = latitude;
            return true;
        }
        return false;
    }
   

    public Longitude getLongitude() {
        return longitude;
    }
    

    public boolean setLong(double degrees, ErrorMessage Error) {
        if (exists(0, degrees, Error)) {
            this.longitude = longitude;
            return true;
        }
        return false;
    }


    public static boolean exists(String fieldName, String field, ErrorMessage Error) {
        boolean error;
        if (error = ( field == null|| "".equals(field))) {
            Error.addErrorMessage("Sorry \"" + field + "\" cannot be left blank");
        }
        return !error;
    }


    public static boolean exists(String degrees, double Latitude, ErrorMessage Error) {
        boolean error;
        if (error = (Latitude > 90 && Latitude < -90 || "".equals(Latitude))) {
            Error.addErrorMessage("Sorry \"" + Latitude + "\" cannot exceed 90>x<-90");
        }
        return !error;
    }


    public static boolean exists(double degrees, double Longitude, ErrorMessage Error) {
        boolean error;
        if (error = (Longitude > 180 && Longitude < -180 || "".equals(Longitude))) {
            Error.addErrorMessage("Sorry \"" + Longitude + "\" cannot exceed 180>x<-180");
        }
        return !error;
    }

    /**
     * Since location class is private this method creates a location object through a factory method.

     * @return
     */
    private static boolean  checkLocation( String name, String description, Latitude latitude,
                                     Longitude longitude, String tempScale){
        return  (
                name != null &&!name.isEmpty()
            && description != null &&!description.isEmpty()
            &&  latitude.isValid()
            &&  longitude.isValid()
        );
    }


    public static Location createLocation(String name, String description, Region parent,
                                          Latitude latitude, Longitude longitude,
                                          String street, String city, String country,
                                          String postcode, String tempScale){
        return checkLocation(name,description,latitude,longitude,tempScale)
               ? new Location(name,description,parent,latitude,longitude, street,city,country,postcode,tempScale)
               : null;
    }
    

    @Override
    public String toString() {
        return "Model.Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", street='" + street + '\'' +
                ", city='" + city + '\''+ '\'' +
                ", country='" + country  + '\'' +
                ", tempScale='" + tempScale + '\'' +
                '}';
    }

    /**
     *
     * @param o - object
     * @return false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        
        return Objects.equals(longitude, location.longitude) &&
                Objects.equals(latitude, location.latitude) &&
                Objects.equals(street, location.street) &&
                Objects.equals(city, location.city) &&
                Objects.equals(country, location.country) &&
                Objects.equals(tempScale, location.tempScale);
    }

}


