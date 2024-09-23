package behavioral.Visitor;

public class JavaVisitor implements Visitor{

    @Override
    public void visit(Fatorial factorial) {   
        programStart(factorial.getClass().getSimpleName());
        printing("int result = 1, i;");
        printing("for (i = 2; i <="+ factorial.getNumber() +"; i++){");
        printing("\tresult *= i;}");
        programEnd();
    }

    @Override
    public void visit(Fibonacci fibonacci) {
        programStart(fibonacci.getClass().getSimpleName());
        printing("int f[]= new int["+ fibonacci.getNumber()+ "+ 2]");
        printing("int i,result=0");
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
    private void programStart(String name){
        printing("Class "+name+"{");
        printing("public static void main(String arg[]){");
    }
    private void programEnd(){
        printing("System.out.println(result);"); 
        printing("}");
        printing("}");
    }
}
