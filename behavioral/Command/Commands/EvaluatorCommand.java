package behavioral.Command.Commands;

import behavioral.Command.History;

public class EvaluatorCommand implements Command{
    private History history;
    private String operation;

    public EvaluatorCommand(History history, String operation){
        this.history=history;
        this.operation=operation;
    }
    @Override
    public void execute() {
        if(operation=="="){
            int x=Integer.parseInt(history.getTop());
            String operator=history.getTop();
            int y=Integer.parseInt(history.getTop());
            int res=0;
            if(operator.equals("+")){
                res=x+y;
            }else if(operator.equals("-")){
                res=y-x;
            }else{  
                res=x*y; 
            }
            System.out.print(res);
            history.add(""+y);
            history.add(operator);
            history.add(""+x);
            history.add(operation);
            history.add(""+res);
            history.add(" ");
        }else if(operation=="~"){
            history.clear();
        }else if(operation=="<-"){
            history.delete();
        }
    }

    @Override
    public void showCommand() {
        System.out.println(operation);
    }
    
}
