package SOLID.DependencyInversion;

import SOLID.DependencyInversion.Versions.IVersion;
import SOLID.DependencyInversion.Versions.Sequoia;
import SOLID.DependencyInversion.Versions.Sonoma;

public class User {
    public static void main(String[] args) {
        IVersion latest=new Sequoia();
        IVersion older=new Sonoma();

        VersionController latestversion=new VersionController(latest);
        latestversion.getInfo();
        VersionController olderversion=new VersionController(older);
        olderversion.getInfo();
    }
}
