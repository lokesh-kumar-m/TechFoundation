package behavioral.Strategy;

public class Employee {
    public static void main(String[] args) {
        WorkStrategy workStrategy=new WorkStrategy();
        workStrategy.setStrategy(new Hybrid());
        workStrategy.defineWorkType();
        workStrategy.setStrategy(new Office());
        workStrategy.defineWorkType();
        workStrategy.setStrategy(new remote());
        workStrategy.defineWorkType();
    }
}
