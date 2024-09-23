package behavioral.Visitor;

public class Fatorial implements Elements{

    private int number;

    public Fatorial(int number){
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
