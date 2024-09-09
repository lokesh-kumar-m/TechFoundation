package behavioral.Command;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        History history=new History();
        Scanner scanner=new Scanner(System.in);
        InvokerInterface invoker=new InvokerInterface(history);
        String input="";
        while(!input.equalsIgnoreCase("q")){
            invoker.showAll();
            input= scanner.nextLine();
            invoker.execute(input);
        }
        scanner.close();
    }
    
}
