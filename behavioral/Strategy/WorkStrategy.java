package behavioral.Strategy;

public class WorkStrategy {
    Work workStrategy;

    public void setStrategy(Work work){
        this.workStrategy=work;
    }
    public void defineWorkType(){
        workStrategy.Type();
    }
}
