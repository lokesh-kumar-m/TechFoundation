package SOLID.DependencyInversion;

import SOLID.DependencyInversion.Versions.IVersion;

public class VersionController {
    private IVersion version;
    
    public VersionController(IVersion version){
        this.version=version;
    }

    public void getInfo(){
        version.getInfo();
        version.getFeatures();
    }
}
