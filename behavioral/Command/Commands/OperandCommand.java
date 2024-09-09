package behavioral.Command.Commands;

import behavioral.Command.History;

public class OperandCommand implements Command{
    private History history;
    private int val;

    public OperandCommand(History history, int val){
        this.history=history;
        this.val=val;
    }

    @Override
    public void showCommand(){
        System.out.println(val);
    }

    @Override
    public void execute() {
        history.add(""+val);
    }
    
}
