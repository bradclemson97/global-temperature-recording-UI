/**
 * @author ET
 * @version 2019-08-23 09:16
 */
public class Coordinate {
    private double degrees;
    private int minutes;
    private double seconds;




    public Coordinate(double degrees, int minutes, double seconds, char direction) {
        this.degrees = (degrees + (minutes / 60.0) + (seconds / 3600.0)) *
                (direction == 'E' || direction == 'S' ? -1 : 1);
    }

    public Coordinate(double degrees, double minutes, double seconds) {
        this.degrees = degrees + ((minutes / 60.0) + (seconds / 3600.0)) * (degrees < 0 ? -1 : 1);
    }

    public Coordinate(double degrees) {
        this.degrees = degrees;
    }

    public int getDegrees() { return (int) degrees; }

    public int getMinutes() {
        return (int) (Math.abs(degrees - getDegrees()) * 60);
    }

    public double getSeconds() {
        return ((Math.abs(degrees - getDegrees()) * 60) - getMinutes()) * 60;
    }

    public double getDMSDegree() {
        return degrees;
    }

    public double getAsDegree() {
        return degrees + ((int) minutes + (double) seconds / 60) / 60 * (degrees >= 0 ? 1 : -1);
    }
}
