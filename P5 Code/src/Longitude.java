
public class Longitude {
    private Coordinate coordinate;

    public Longitude(double degrees) {
        coordinate = new Coordinate(degrees);
    }

    public Longitude(double degrees, int minutes, double seconds, char direction) {
          coordinate = new Coordinate(degrees, minutes, seconds, direction);
    }

    public int getDegrees() {
        return coordinate.getDegrees();
    }

    public int getMinutes() {
        return coordinate.getMinutes();
    }

    public double getSeconds() {
        return coordinate.getSeconds();
    }

    public double getDMSDegree() {
        return coordinate.getDMSDegree();
    }

    public char getDirection() {
        return getDegrees() <0 ? 'E': 'W';
    }

    public double getAsDegree() {
        return coordinate.getAsDegree();

    }

    public static Valid<Longitude> create(double degrees, int minutes, double seconds,
                                          char direction) {
        if (degrees < 0 || degrees > 180 || (degrees == 180 && (seconds != 0 || minutes != 0))) {
            return new Valid<>("Degree value out of range should be between 0 and 180");
        }
        if (direction != 'E' && direction != 'W') {
            return new Valid<>("Direction should be 'E' or 'W'");
        }
        if (minutes < 0 || minutes > 60 || (minutes == 60 && (seconds != 0))) {
            return new Valid<>("Minutes out of range should be between 0 and 60 inclusive");
        }
        if (seconds < 0.0 || seconds > 60.0) {
            return new Valid<>("Seconds out of range should be between 0 and 60 inclusive");
        }
        return new Valid<>(new Longitude(degrees, minutes, seconds, direction));
    }


}
