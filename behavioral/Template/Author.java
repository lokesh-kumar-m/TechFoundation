package behavioral.Template;

import java.util.ArrayList;
import java.util.List;

public class Author {
    public static void main(String[] args) {
        Git git= new Git("lome", "Xavier", "X07Cvrb");
        UpdateGit updateGit =new LocalRepo();
        List<String> fileChanges=new ArrayList<>();
        fileChanges.add("Strategy Impl");
        fileChanges.add("State Impl");
        fileChanges.add("Observer Impl");
        fileChanges.add("Memento Impl");
        updateGit.save(fileChanges, "Implemented Template", git);
    }    
}
