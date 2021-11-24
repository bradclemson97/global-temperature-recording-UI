import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author ET
 * @version 2019-08-23 09:14
 */
public class Task2Coordinates {
    @Test
    public void CoordinateGreenwich() {
        Coordinate coordinate = new Coordinate(0, 0, 0.0, 'E');
        assertEquals(0, coordinate.getDegrees());
        assertEquals(0, coordinate.getMinutes());
        assertEquals(0.0,coordinate.getSeconds(), 0.00);
        assertEquals(0.0, coordinate.getDMSDegree(), 0.0);

        coordinate = new Coordinate(51, 28, 40.1412, 'N');
        assertEquals(51, coordinate.getDegrees());
        assertEquals(28, coordinate.getMinutes());
        assertEquals(40.1412,coordinate.getSeconds(), 0.0001);
        assertEquals(51.477817, coordinate.getDMSDegree(), 0.0);
    }

    @Test
    public void CoordinateAston() {
        Coordinate coordinate = new Coordinate(1, 53, 24.1254, 'W');
        assertEquals(-1, coordinate.getDegrees());
        assertEquals(53, coordinate.getMinutes());
        assertEquals(24.1254,coordinate.getSeconds(), 0.0001);
        assertEquals(-1.890035, coordinate.getDMSDegree(), 0.0001);

        coordinate = new Coordinate(4, 10, 0.09, 'S');
        assertEquals(-4, coordinate.getDegrees());
        assertEquals(10, coordinate.getMinutes());
        assertEquals(0.09,coordinate.getSeconds(), 0.0001);
        assertEquals(-4.16669, coordinate.getDMSDegree(), 0.0001);

    }

    @Test
    public void CoordinateTableMountain() {
        Coordinate coordinate = new Coordinate(18, 24, 33.5124);
        assertEquals(18, coordinate.getDegrees());
        assertEquals(24, coordinate.getMinutes());
        assertEquals(33.5124,coordinate.getSeconds(), 0.0001);
        assertEquals(18.409309, coordinate.getDMSDegree(), 0.0001);

        coordinate = new Coordinate(-33, 58, 18.6132);
        assertEquals(-33, coordinate.getDegrees());
        assertEquals(58, coordinate.getMinutes());
        assertEquals(18.6132,coordinate.getSeconds(), 0.0001);
        assertEquals(-33.971837, coordinate.getDMSDegree(), 0.0001);
    }

    @Test
    public void WellingtonAirport() {
        Coordinate coordinate = new Coordinate(174.782099);
        assertEquals(174, coordinate.getDegrees());
        assertEquals(46, coordinate.getMinutes());
        assertEquals(55.5558,coordinate.getSeconds(), 0.01);
        assertEquals(174.782099, coordinate.getDMSDegree(), 0.0001);

        coordinate = new Coordinate(-41.290485);
        assertEquals(-41, coordinate.getDegrees());
        assertEquals(17, coordinate.getMinutes());
        assertEquals(25.7454,coordinate.getSeconds(), 0.01);
        assertEquals(-41.290485, coordinate.getDMSDegree(), 0.0001);
    }

    @Test
    public void verifyNegativeZeroDegrees() {
        Coordinate coordinate = new Coordinate(-0.1);
        assertEquals(-0, coordinate.getDegrees());
        assertEquals(6, coordinate.getMinutes());
        assertEquals(0.0,coordinate.getSeconds(), 0.01);
        assertEquals(-0.1, coordinate.getDMSDegree(), 0.0001);

        coordinate = new Coordinate(0, 6, 0.00, 'S');
        assertEquals(-0, coordinate.getDegrees());
        assertEquals(6, coordinate.getMinutes());
        assertEquals(0.00,coordinate.getSeconds(), 0.0001);
        assertEquals(-0.1, coordinate.getDMSDegree(), 0.0001);
    }
}
