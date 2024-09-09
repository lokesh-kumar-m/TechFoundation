package behavioral.Command;

import java.util.HashMap;
import java.util.Map;

import behavioral.Command.Commands.Command;
import behavioral.Command.Commands.EvaluatorCommand;
import behavioral.Command.Commands.OperandCommand;
import behavioral.Command.Commands.OperatorCommand;

public class InvokerInterface {
    private HashMap<String, Command> buttons=new HashMap<>();

    public InvokerInterface(History history){
        this.buttons.put("one", new OperandCommand(history, 1));
        this.buttons.put("two",new OperandCommand(history, 2));
        this.buttons.put("three",new OperandCommand(history, 3));
        this.buttons.put("four",new OperandCommand(history, 4));
        this.buttons.put("five",new OperandCommand(history, 5));
        this.buttons.put("six",new OperandCommand(history, 6));
        this.buttons.put("add",new OperatorCommand(history, "+"));
        this.buttons.put("minus",new OperatorCommand(history, "-"));
        this.buttons.put("multiply",new OperatorCommand(history, "*"));
        this.buttons.put("result",new EvaluatorCommand(history, "="));
        this.buttons.put("reset",new EvaluatorCommand(history, "~"));
        this.buttons.put("delete",new EvaluatorCommand(history, "<-"));
    }

    public void showAll(){
        System.out.println("===========================================================");
        for(Map.Entry<String,Command> cmds: buttons.entrySet() ){
            System.out.print(cmds.getKey()+"\t");
        }
        System.out.println();
    }
    public void execute(String action){
        if(buttons.containsKey(action)){
            buttons.get(action).execute();
        }
    }
}
