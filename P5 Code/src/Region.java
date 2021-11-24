//PACKAGE_NAME
  //      Brad
    //    2019-08-30
      //  11:29


import java.util.ArrayList;
import java.util.HashMap;

public class Region extends AbstractRegion {

    private HashMap<String, AbstractRegion> children = new HashMap<>();
    public static HashMap<String, Region> regions = new HashMap<>();


    public Region(String name, String description){
        super(name, description, null);
        regions.put(name, this);
    }


    public Region(String name, String description, Region parent){
        super(name, description, parent);
        regions.put(name, this);
    }

    public ArrayList<AbstractRegion> getChildren() {return new ArrayList<>();}

    public static Valid<Region> create(String name, String description) {
        return new Valid<>(new Region(name, description));
    }

    public static Valid<Region> create(String name, String description, Region parent) {
        return new Valid<>(new Region(name, description, parent));
    }


    public void add(AbstractRegion abstractRegion) {
        children.put(abstractRegion.getName(), abstractRegion);
    }

    public AbstractRegion getChild(String name) {
        return children.get(name);
    }

    public static Region [] getRegions() {
        return regions.values().toArray(new Region[regions.size()]);
    }

    public static Region[] getRegionsNames() {
        return regions.keySet().toArray(new Region[regions.size()]);
    }



    //void addField(String region, AbstractRegion location) {
    //    abstractRegions.put(region, location);
    //}



}


