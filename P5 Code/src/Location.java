//PACKAGE_NAME
  //      Brad
    //    2019-09-03
      //  14:06



import java.util.Objects;

public class Location extends AbstractRegion {

    private String street;
    private String city;
    private String country;
    private String tempScale;
    private Latitude latitude;
    private Longitude longitude;


    public Location(String name, String description, Region parent, Latitude latitude, Longitude longitude, String street, String city, String country, String tempScale) {
        super(name, description, parent);
        this.street = street;
        this.city = city;
        this.country = country;
        this.tempScale = tempScale;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getStreet() {
        return street;
    }


    public String getCity() {
        return city;
    }


    public String getCountry() {
        return country;
    }


    public String getTempScale() {
        return tempScale;
    }


    public Latitude getLatitude() {
        return latitude;
    }


    public Longitude getLongitude() {
        return longitude;
    }




    /**
     * with fields in location class as private this method creates a location object through a factory method.
     */


    public static Valid<Location> create(String name, String description, Region parent,
                                         Latitude latitude, Longitude longitude,
                                         String street, String city, String country, String tempScale) {

        return new Valid<>(new Location(name, description, parent, latitude, longitude, street, city, country, tempScale));
    }


    /**
     *A default method that is used when the user calls a location string
     */
    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", city='" + city + '\''+ '\'' +
                ", country='" + country  + '\'' +
                ", tempScale='" + tempScale + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
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






