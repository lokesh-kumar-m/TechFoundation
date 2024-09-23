package behavioral.Visitor;

public class Fibonacci implements Elements {
    private int number;

    public Fibonacci(int number){
        this.number=number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public int getNumber(){
        return this.number;
    }
}
