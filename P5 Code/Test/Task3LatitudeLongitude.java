import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ET
 * @version 29/08/2019 14:29
 */
public class Task3LatitudeLongitude {
    @Test
    public void verifyLatitude() {
        Valid<Latitude> validLatitude = Latitude.create(51, 28, 40.1412, 'N');
        assertTrue(validLatitude.isPresent());
        Latitude latitude = validLatitude.get().get();
        assertEquals(51, latitude.getDegrees());
        assertEquals(28, latitude.getMinutes());
        assertEquals(40.1412,latitude.getSeconds(), 0.0001);
        assertEquals('N', latitude.getDirection());
        assertEquals(51.477817, latitude.getDMSDegree(), 0.0);
    }

    @Test
    public void verifyDegreesInvalidLatitude() {
        Valid<Latitude> validLatitude = Latitude.create(-1, 1, 1.1, 'S');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Degree value out of range should be between 0 and 90",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(0, 1,1.1,'S');
        assertTrue(validLatitude.isPresent());
        assertFalse(validLatitude.isEmpty());
        assertTrue(validLatitude.noMessages());

        validLatitude = Latitude.create(91, 1,1.1,'S');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Degree value out of range should be between 0 and 90",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(90, 0,0.1,'S');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Degree value out of range should be between 0 and 90",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(90, 1,0.0,'S');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Degree value out of range should be between 0 and 90",
                validLatitude.getErrorMessage());
    }

    @Test
    public void verifyDirectionInvalidLatitude() {
        Valid<Latitude> validLatitude = Latitude.create(0, 1,1.1,'X');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Direction should be 'S' or 'N'",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(0, -1,1.1,'N');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Minutes out of range should be between 0 and 60 inclusive",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(0, 61,1.1,'N');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Minutes out of range should be between 0 and 60 inclusive",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(0, 60,0.1,'N');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Minutes out of range should be between 0 and 60 inclusive",
                validLatitude.getErrorMessage());
    }

    @Test
    public void verifySecondsInvalidLatitude() {
        Valid<Latitude> validLatitude = Latitude.create(0, 60,0.0,'N');
        assertTrue(validLatitude.isPresent());
        assertFalse(validLatitude.isEmpty());
        assertTrue(validLatitude.noMessages());

        validLatitude = Latitude.create(0, 1,-0.0001,'S');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Seconds out of range should be between 0 and 60 inclusive",
                validLatitude.getErrorMessage());

        validLatitude = Latitude.create(0, 1,60.0001,'S');
        assertFalse(validLatitude.isPresent());
        assertTrue(validLatitude.isEmpty());
        assertFalse(validLatitude.noMessages());
        assertEquals("Seconds out of range should be between 0 and 60 inclusive",
                validLatitude.getErrorMessage());
    }

    @Test
    public void verifyLongitude() {
        Valid<Longitude> validLongitude = Longitude.create(51, 28, 40.1412, 'W');
        assertTrue(validLongitude.isPresent());
        Longitude longitude = validLongitude.get().get();
        assertEquals(51, longitude.getDegrees());
        assertEquals(28, longitude.getMinutes());
        assertEquals(40.1412,longitude.getSeconds(), 0.0001);
        assertEquals('W', longitude.getDirection());
        assertEquals(51.477817, longitude.getDMSDegree(), 0.0);
    }

    @Test
    public void verifyDegreesInvalidLongitude() {
        Valid<Longitude> longitudeValid = Longitude.create(-1, 1, 1.1, 'E');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Degree value out of range should be between 0 and 180",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(0, 1,1.1,'E');
        assertTrue(longitudeValid.isPresent());
        assertFalse(longitudeValid.isEmpty());
        assertTrue(longitudeValid.noMessages());

        longitudeValid = Longitude.create(181, 1,1.1,'E');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Degree value out of range should be between 0 and 180",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(180, 0,0.1,'E');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Degree value out of range should be between 0 and 180",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(180, 1,0.0,'E');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Degree value out of range should be between 0 and 180",
                longitudeValid.getErrorMessage());
    }

    @Test
    public void verifyMinutesInvalidLongitude() {
        Valid<Longitude> longitudeValid = Longitude.create(0, 1,1.1,'X');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Direction should be 'E' or 'W'",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(0, -1,1.1,'W');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Minutes out of range should be between 0 and 60 inclusive",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(0, 61,1.1,'W');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Minutes out of range should be between 0 and 60 inclusive",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(0, 60,0.1,'W');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Minutes out of range should be between 0 and 60 inclusive",
                longitudeValid.getErrorMessage());
    }

    @Test
    public void verifySecondsInvalidLongitude() {
        Valid<Longitude> longitudeValid = Longitude.create(0, 60,0.0,'W');
        assertTrue(longitudeValid.isPresent());
        assertFalse(longitudeValid.isEmpty());
        assertTrue(longitudeValid.noMessages());

        longitudeValid = Longitude.create(0, 1,-0.0001,'E');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Seconds out of range should be between 0 and 60 inclusive",
                longitudeValid.getErrorMessage());

        longitudeValid = Longitude.create(0, 1,60.0001,'E');
        assertFalse(longitudeValid.isPresent());
        assertTrue(longitudeValid.isEmpty());
        assertFalse(longitudeValid.noMessages());
        assertEquals("Seconds out of range should be between 0 and 60 inclusive",
                longitudeValid.getErrorMessage());
    }
}
