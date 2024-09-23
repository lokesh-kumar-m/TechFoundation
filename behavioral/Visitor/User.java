package behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<Elements> elements=new ArrayList<>();
        elements.add(new Fatorial(5));
        elements.add(new Fibonacci(5));

        Visitor jVisitor=new JavaVisitor();
        for (Elements ele : elements) {
            ele.accept(jVisitor);
        }
        Visitor jsVisitor=new JavaScriptVisitor();

        for (Elements ele : elements) {
            ele.accept(jsVisitor);
        }
    }
}
