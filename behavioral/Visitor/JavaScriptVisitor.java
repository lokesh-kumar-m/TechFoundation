package behavioral.Visitor;

public class JavaScriptVisitor implements Visitor{

    @Override
    public void visit(Fatorial factorial) {   
        programStart(factorial.getClass().getSimpleName(),factorial.getNumber());
        printing("let result = 1, i;");
        printing("for (i = 2; i <="+ factorial.getNumber() +"; i++){");
        printing("\tresult *= i;}");
        programEnd();
    }

    @Override
    public void visit(Fibonacci fibonacci) {
        programStart(fibonacci.getClass().getSimpleName(),fibonacci.getNumber());

        printing("let f = new Array(n+2);");
        printing("let i,result=0");
        printing("f[0] = 0;\r\n" + //
                        "f[1] = 1;");
        printing("for (i = 2; i <="+ fibonacci.getNumber() +"; i++) {");
        printing("\tf[i] = f[i - 1] + f[i - 2];}");
        printing("result=f["+fibonacci.getNumber()+"]");
        programEnd();
    }
    
    private void printing(String str){
        System.out.println(str);
    }
    private void programStart(String name,int n){
        printing("function "+name+"("+n+"){");
    }
    private void programEnd(){
        printing("document.write(result);"); 
        printing("}");
    }
    
}
