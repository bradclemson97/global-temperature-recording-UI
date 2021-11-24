package Model;//PACKAGE_NAME
  //      Brad
    //    2019-08-30
      //  11:29


import java.util.ArrayList;
import java.util.HashMap;


public class Region extends AbstractRegion {
    private HashMap<String, AbstractRegion> regions = new HashMap<>(); {
    }

    public Region( String name,
                   String description,
                   Region parent){

        super(name, description, parent);
    }

    public void addField(AbstractRegion location) {
        regions.put(location.getName(), location);
    }


    public String toString() {
        return getName();
    }



}


