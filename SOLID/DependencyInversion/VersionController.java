package SOLID.DependencyInversion;

public class VersionController {
    private Version version;
    
    public VersionController(Version version){
        this.version=version;
    }

    public void getInfo(){
        version.getInfo();
        version.getFeatures();
    }
}
