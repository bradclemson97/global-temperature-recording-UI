
//PACKAGE_NAME
//      Brad
//    2019-09-02
//  12:05




import java.util.Objects;
import java.util.Optional;

public abstract class AbstractRegion {
    private String name, description;
    private Region parent;

    public AbstractRegion(String name, String description, Region parent) {
        this.name = name;
        this.description = description;
        this.parent = parent;
        if(parent !=null) {
            parent.add(this);
        }

    }



    public String getName() { return name; }

    public String getDescription() { return description; }

    //optional for functional programmers
    public Optional<Region> getParent() {
        return Optional.ofNullable(parent);
    }



    @Override
    public boolean equals( Object o ){
        if (this == o) return true;
        if (!( o instanceof AbstractRegion )) return false;
        AbstractRegion that=( AbstractRegion ) o;
        return name.equals(that.name)
                && description.equals(that.description)
                && Objects.equals(parent, that.parent);

    }

    @Override
    public int hashCode( ){
        return Objects.hash(name, description, parent);
    }

    @Override
    public String toString( ){
        return "AbstractRegion{"
                +"name='"+name+'\''
                +", description='"+description+'\''
                +", parent="+parent

                +'}';
    }

}