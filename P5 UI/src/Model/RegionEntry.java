//package Model;
//
////PACKAGE_NAME
//  //      Brad
//    //    2019-09-05
//      //  16:22
//
//// how will parent and default scale work in terms of the drop down? i think they must have seperate classes to which they relate
//
//import java.util.ArrayList;
//
//public class RegionEntry {
//    private Region parent;
//    private String name;
//    private String description;
//    private TemperatureScale temperatureScale;
//
//    /**
//     * This is called when a new Region object is being created. It is declared private so that
//     * the creation has to be done through the factory method (createRegion). The factory method
//     * carries out any validation of the values for the object.
//     *
//     * @param parent           is a reference to a Region object that is to be associated with this
//     *                         Region entry
//     * @param name             is a reference to a region object that is to be associated with this Region entry
//     * @param description      is the description of the region
//     * @param temperatureScale is the temperature scale assigned for this Region entry
//     */
//    private RegionEntry(Region parent, String name, String description, TemperatureScale temperatureScale) {
//        this.parent = parent;
//        this.name = name;
//        this.description = description;
//        this.temperatureScale = temperatureScale;
//
//    }
//
//    /**
//     * Retrieves the parent object associated with the region entry
//     *
//     * @return a parent object that is the region associated with region entry
//     */
//    public Region getParent() {
//        return parent;
//    }
//
//    /**
//     * Sets the parent object that is to be associated with the region entry
//     *
//     * @param parent reference for the student to be associated with the enrolment
//     */
//    public void setParent(Region parent) {
//        this.parent = parent;
//    }
//
//    /**
//     * Retrieves the name assoicated with this region entry
//     *
//     * @return a name object that is associated with the region entry
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * Sets the name object associated with the region entry
//     *
//     * @param name reference for the name to be associated with this region entry
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * Retrieves the description of the region
//     *
//     * @return the year of enrolment
//     */
//    public String getDescription() {
//        return description;
//    }
//
//    /**
//     * Sets the description of the region
//     *
//     * @param description of enrolment
//     */
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    /**
//     * Retrieves the temperature scale of the region entry
//     *
//     * @return a string representing the temperature scale of the enrolment
//     */
//    public TemperatureScale getTemperatureScale() {
//        return temperatureScale;
//    }
//
//    /**
//     * Sets the temperature scale of the region entry
//     *
//     * @param temperatureScale of the enrolment
//     */
//    public void setTemperatureScale(TemperatureScale temperatureScale) {
//        this.temperatureScale = temperatureScale;
//    }
//
//
//
//    /**
//     * Retrieves the default string for a region entry
//     *
//     * @return a string value representing this region entry
//     */
//    @Override
//    public String toString() {
//        return (getParent() == null ? "No parent data" : getParent().toString()) +
//                " containing " + getName() + " described as " + getDescription() +
//                (getTemperatureScale() == null ? "No temperature scale data" : getTemperatureScale().toString());
//    }
//
//    /**
//     * Defines what equality means for to region entry objects
//     *
//     * @param o is any object
//     * @return true if the objects are assessed as equal
//     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof RegionEntry)) return false;
//
//        RegionEntry regionEntry = (RegionEntry) o;
//
//        return name == regionEntry.name;
//    }
//
//    /**
//     * This is a factory method to create a new region object.
//     *
//     * @param parent           reference for the parent to be associated with the region entry
//     * @param name             assigned to the enrolemnt
//     * @param description      of the region entry
//     * @param temperatureScale of the enrolment
//     * @return the newly created region object if the values are assessed as valid or a null
//     * reference if they are not
//     */
//    public static RegionEntry createRegionEntry(Region parent, String name, String description, TemperatureScale temperatureScale) {
//        Model.setErrorMessage("");
//        boolean error = false;
//        if (parent == null) {
//            Model.addErrorMessage("No current parent selected");
//            error = true;
//        }
//        if (name == null || name.equals("")) {
//            Model.addErrorMessage("No name entered");
//            error = true;
//        }
//        if (description == null || description.equals("")) {
//            Model.addErrorMessage("No description entered");
//            error = true;
//        }
//        if (temperatureScale == null || temperatureScale.equals("")) {
//            Model.addErrorMessage("No enrolment status entered");
//            error = true;
//        }
//
//        if (error) {
//            return null;
//        }
//        return new RegionEntry(parent, name, description, temperatureScale);
//    }
//}
