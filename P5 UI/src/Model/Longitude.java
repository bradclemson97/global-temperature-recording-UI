package Model;

public class Longitude {
    Coordinate coordinate;


    public Longitude(double degrees) {
        coordinate = new Coordinate(degrees);
    }


    public Longitude(int degrees, int minute, double seconds, char direction) {
        coordinate = new Coordinate(degrees, minute, seconds, direction);
    }


    public Longitude(int degrees, int minute, double seconds) {
        coordinate = new Coordinate(degrees, minute, seconds);
    }


    public int getDegrees() {
        return coordinate.getDegrees();
    }


    public int getMinute() {
        return coordinate.getMinutes();
    }


    public double getSeconds() {
        return coordinate.getSeconds();
    }


    public char getDirection() {
        if (getDegrees() >= 0) {
            return 'E';
        } else
            return 'W';
    }


    public double getAsDegrees() {
        return coordinate.getAsDegrees();

    }
    public boolean isValid(){
        return (
                Math.abs(getAsDegrees())<=180   //-180<= X >=180
                        &&  ((getDirection() != 'E' && getDirection() != 'W') || (getAsDegrees() > -1)
                )
                        &&  getMinute()>=0 && getMinute()<=60
                        &&  getSeconds()>=0 && getSeconds()<=60
        );
    }
}
