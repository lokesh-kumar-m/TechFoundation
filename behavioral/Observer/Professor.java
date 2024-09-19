package behavioral.Observer;


import java.util.HashMap;

import behavioral.Observer.Observable.Canvas;
import behavioral.Observer.Observers.Student;
// import behavioral.Observer.Observers.*;
public class Professor {
    public static void main(String[] args) {
        HashMap<String, String> results=new HashMap<>();
        Canvas canvas=new Canvas();
        Student lome=new Student(canvas);
        Student rore=new Student(canvas);
        Student sakn=new Student(canvas);
        Student bhsa=new Student(canvas);
        
        canvas.register(lome);
        canvas.register(rore);
        canvas.register(sakn);
        canvas.register(bhsa);

        lome.setName("lome");
        lome.setAssignment(true);

        rore.setName("rore");
        rore.setAssignment(true);

        sakn.setName("sakn");
        sakn.setAssignment(false);

        bhsa.setName("bhsa");
        bhsa.setAssignment(true);
        
        results.put(lome.getName(), lome.getAssignemnt()?"Pass":"Fail" );
        results.put(rore.getName(), rore.getAssignemnt()?"Pass":"Fail" );
        results.put(sakn.getName(), sakn.getAssignemnt()?"Pass":"Fail" );
        results.put(bhsa.getName(), bhsa.getAssignemnt()?"Pass":"Fail" );

        canvas.setResults(results);
    }
}
