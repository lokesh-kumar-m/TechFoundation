package SOLID.DependencyInversion;

public class User {
    public static void main(String[] args) {
        Version latest=new Sequoia();
        Version older=new Sonoma();

        VersionController latestversion=new VersionController(latest);
        latestversion.getInfo();
        VersionController olderversion=new VersionController(older);
        olderversion.getInfo();
    }
}
