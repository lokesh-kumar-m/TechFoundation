package behavioral.Command.Commands;

import behavioral.Command.History;

public class OperatorCommand implements Command{

    private History history;
    private String operator;

    public OperatorCommand(History history, String expression){
        this.history=history;
        this.operator=expression;
    }

    @Override
    public void showCommand(){
        System.out.println(operator);
    }

    @Override
    public void execute() {
        history.add(""+operator);
    }
    
}
