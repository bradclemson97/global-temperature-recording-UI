
public class Latitude {
    private Coordinate coordinate;

    public Latitude(double degrees) {
        coordinate = new Coordinate(degrees);
    }

    public Latitude(double degrees, int minutes, double seconds, char direction) {
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
        return getDegrees() <0 ? 'S': 'N';
    }

    public double getAsDegree() { return coordinate.getAsDegree(); }

    public static Valid<Latitude> create(double degrees, int minutes, double seconds, char direction) {
        if (degrees < 0 || degrees > 90 || (degrees == 90 && (seconds != 0 || minutes != 0)))  {
            // two vertical lines '||' mean 'or' and '!' means 'not' (e.g. not equal to 0)
            return new Valid<>("Degree value out of range should be between 0 and 90");
        }
        if (direction != 'S' && direction != 'N') {
            return new Valid<>("Direction should be 'S' or 'N'");
        }
        if (minutes < 0 || minutes > 60 || (minutes == 60 && (seconds != 0))) {
            return new Valid<>("Minutes out of range should be between 0 and 60 inclusive");
        }
        if (seconds < 0.0 || seconds > 60.0) {
            return new Valid<>("Seconds out of range should be between 0 and 60 inclusive");
        }
        return new Valid<>(new Latitude(degrees, minutes, seconds, direction));
    }

}
