package behavioral.Template;

import java.util.List;

public abstract class UpdateGit {
    public void save(List<String> lst,String message,Git git){
        System.out.println("============");
        double random =Math.random();
        System.out.println("[main "+random*1000+ "]");
        System.out.println(lst.size()+" insertions (+)");
        for(int i=0;i<lst.size();i++){
            System.out.println((i+1)+" + " +lst.get(i));
        }
        beforeSave(git);
        System.out.println("Commited:"+message);
        afterSave(git);
    }
    public abstract void beforeSave(Git git);
    public abstract void afterSave(Git git);
}
