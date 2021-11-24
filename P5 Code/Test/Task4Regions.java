//PACKAGE_NAME
  //      Brad
    //    2019-09-03
      //  14:26

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task4Regions {

    @Test
    public void verifyRegionCreation() {
        Valid<Region> regionValid = Region.create("Europe", "Geographical Europe");
        assertTrue(regionValid.isPresent());
        assertTrue(regionValid.noMessages());
        Region region = regionValid.get().get();
        assertEquals("Europe", region.getName());
        assertEquals("Geographical Europe", region.getDescription());
        assertFalse(region.getParent().isPresent());
        assertTrue(region.getChildren().isEmpty());
    }

    /*
    Given I try to create a region with no name
    Then Iexpect the region not to be created
    And to receive a message that no name was provided
     */

    @Test
    public void rejectNoName() {
        Valid<Region> regionValid = Region.create("", "Geographical Europe");
        assertFalse(regionValid.isPresent());
        assertFalse(regionValid.noMessages());
        assertEquals("No  region name was provided.", regionValid.getErrorMessage());

        regionValid = Region.create(null, "Geographical Europe");
        assertFalse(regionValid.isPresent());
        assertFalse(regionValid.noMessages());
        assertEquals("No region was provided.", regionValid.getErrorMessage());
    }


    @Test
    public void verifyAddingOfParent() {
        Valid<Region> parentRegionValidation = Region.create("Europe", "Geographical Europe");
        Region parent = parentRegionValidation.get().get();
        Valid<Region> childRegionValidation = Region.create("UK", "United Kingdom");
        Region child = childRegionValidation.get().get();
        assertTrue(child.getParent().isPresent());
        assertFalse(parent.getChildren().isEmpty());
        assertSame(child, parent.getChild("UK"));
        assertSame(parent, child.getParent().get());

    }



//    @Test
//    public void Test1() {
//        //Given that I have a parent region and region class
//        //When I input the name, description and parent for the parent region and region
//        Region Europe = new Region("Europe", "Europe is a continent of the world", null);
//        Region UK = new Region("UK", "UK is a sub region of Europe", Europe);
//        UK.addField("Europe", UK);
//        //Then I am able to use a specific get to return the necessary variables.
//        //Therefore when I use getName I can return England
//        assertEquals("UK", "UK", UK.getName());
//        //And I can also return the description from either of the region types
//        //Therefore in this case i will return Europe is a continent of the world using getDescription
//        assertEquals("Europe is a continent of the world", "Europe is a continent of the world", Europe.getDescription());
//    }
//
//    @Test
//    public void Test2() {
//        Latitude latitude = new Latitude(52.487327);
//        Longitude longitude = new Longitude(-1.890035);
//        // given I create a location
//        Location Aston = Location.create("Aston University", "My University",
//                null, latitude, longitude, "Aston Street", "Birmingham",
//                "United Kingdom", null);
//        //when i get name it should return Aston University
//        assertEquals("Aston University", "Aston University", Aston.getName());
//        // and when i get description it should return my university
//        assertEquals("My University", "My University", Aston.getDescription());
//
//        //below checks to see whether the delegation and inheritance instances have been created
//        assertEquals(52.487327, Aston.getLatitude().getAsDegree(), 0.00001);
//        assertEquals(-1.890035, Aston.getLongitude().getAsDegree(), 0.00001);
//        assertEquals('N', 'N', Aston.getLatitude().getDirection());
//    }
//
//    @Test
//    public void Test3() {
//        Latitude latitude = new Latitude(-41.290485);
//        Longitude longitude = new Longitude(174.782099);
//        //Given that I create a region class
//        //After I input the name, description and parent for the region
//        Region Thailand = new Region("Thailand", "Thailand is a sub region of Asia", null);
//        //And the elements belonging to location
//        Location Bangkok = Location.createLocation("Bangkok Airport", "Holiday destination",
//                null, latitude, longitude, "Airport street", "Bangkok", "Thailand", null);
//
//        //I am able to use a specific get to return the necessary variables.
//        //Therefore when i use getName I can return Weelington
//        assertEquals("Thailand", "Thailand", Thailand.getName());
//        //And I can also return whichever description from either of the region types
//        //Therefore in this case i will return Thailand is a sub region of Asia using getDescription
//        assertEquals("Thailand is a sub region of Asia", "Thailand is a sub region of Asia", Thailand.getDescription());
//        //when i get name it should return Bangkok Airport
//        assertEquals("Wellington Airport", "Wellington Airport", Bangkok.getName());
//        //Holiday destination is returned when getDescription is used
//        assertEquals("Holiday destination", "Holiday destination", Bangkok.getDescription());
//        //The city Bangkok is returned when the get city getter is used
//        assertEquals("Bangkok", "Bangkok", Bangkok.getCity());
//
//
//
//
//    }
}


