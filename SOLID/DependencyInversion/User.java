package SOLID.DependencyInversion;

public class User {
    public static void main(String[] args) {
        VersionFactory versionFactory=new VersionFactory();
        versionFactory.printVersion();
        VersionController latestversion=new VersionController(versionFactory.createVersion("v1"));
        latestversion.getInfo();
    }
}
