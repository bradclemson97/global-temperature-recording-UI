package Model;

public class Latitude {
    Coordinate coordinate;


    public Latitude(double degrees) {
        coordinate = new Coordinate(degrees);
    }


    public Latitude(int degrees, int minute, double seconds, char direction) {
        coordinate = new Coordinate(degrees, minute, seconds, direction);
    }


    public Latitude(int degrees, int minute, double seconds){
        coordinate = new Coordinate(degrees, minute, seconds);
    }

    public double getAsDegrees() {
        return coordinate.getAsDegrees();

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
            return 'N';
        } else
            return 'S';
    }

    public boolean isValid(){
        return (
                Math.abs(getAsDegrees())<=90   //-90<= X >=90
                        &&  ((getDirection() != 'N' && getDirection() != 'S') || (getAsDegrees() > -1)
                )
                        &&  getMinute()>=0 && getMinute()<=60
                        &&  getSeconds()>=0 && getSeconds()<=60
        );
    }

}
