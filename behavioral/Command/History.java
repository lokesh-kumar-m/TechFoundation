package behavioral.Command;

import java.util.Stack;

public class History {
    private Stack<String> history;
    public History(){
        history=new Stack<>();
    }

    public void clear(){
       String result="";
        while(!history.isEmpty()){
        result=history.pop()+result;
       }
       System.out.println(result);
    }
    public void add(String token){
        history.push(token);
    }

    public String getTop(){
        return history.pop();
    }

    public void delete(){
        history.pop();
    }
}
