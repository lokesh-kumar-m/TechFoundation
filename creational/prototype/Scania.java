package creational.prototype;

public class Scania implements Car {

    private String model="ST1G05";
    private String color;

    public Scania(String color){
        this.color=color;
    }

    @Override
    public Car copy() {
       return new Scania(this.color);
    }

    @Override
    public String getCarInfo() {
        return "A new Scania Truck, model: "+model+" and color: "+color;
    }

    @Override
    public void setColour(String newColour) {
       this.color=newColour;
    }
    
}
