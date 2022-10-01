
public class Archive {

    private String identifier;
    private String name;
    
    public Archive(String initialIdentifier, String initialName){
        this.identifier = initialIdentifier;
        this.name = initialName;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        } else if (!(compared instanceof Archive)) {
            return false;
        }
        Archive comparedArchive = (Archive) compared;

        if(this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }
        return false;
    }
}