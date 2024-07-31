package creational.prototype;

public class Volvo implements Car{

    private String color;
    private String model="V2XB07";
    private int released=2024;
    private String tyres="4 + Spare";

    public Volvo(String color){
        this.color=color;
    }

    public Car copy(){
        return new Volvo(this.color);
    }

    public String getCarInfo(){
        return "A new Volvo Car, model: "+model+" and color: "+color+". Released in"+released+" with tyres "+tyres;
    }

    public void setColour(String newColour){
        this.color=newColour;
    }
    
}
