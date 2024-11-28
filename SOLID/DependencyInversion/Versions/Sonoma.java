package SOLID.DependencyInversion.Versions;

public class Sonoma implements IVersion{

    @Override
    public void getInfo() {
        System.out.println("MacOs 14.7");
        System.out.println("Released in Septempber 2023");
    }

    @Override
    public void getFeatures() {
        System.out.println("Multi user profiles in browser");
        System.out.println("improved Ui for calls");
        System.out.println("reactions based on guestures");
    }
    
}
