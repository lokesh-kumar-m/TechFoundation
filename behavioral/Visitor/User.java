package behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<IProgram> elements=new ArrayList<>();
        elements.add(new Fatorial(5));
        elements.add(new Fibonacci(5));

        Visitor jVisitor=new JavaVisitor();
        for (IProgram ele : elements) {
            ele.accept(jVisitor);
        }
        Visitor jsVisitor=new JavaScriptVisitor();

        for (IProgram ele : elements) {
            ele.accept(jsVisitor);
        }
    }
}
