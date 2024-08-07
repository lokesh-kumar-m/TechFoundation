package Structural.bridge.implementation;
//Every burger need to have buns. Inbetween buns there are patty and sauce.
//different burgers have different addons that make them tastier which are added during composing
public abstract class Burger {

    private String sauce;
    private String patty;
    private String buns;

    public Burger(String bun, String sauce, String patty) {
        this.buns = bun;
        this.sauce = sauce;
        this.patty = patty;
    }

    public String getSauce() {
        return sauce;
    }

    public String getPatty() {
        return patty;
    }

    public String getBuns() {
        return buns;
    }
    
    public abstract void compose();

    public abstract String wrap();
}
