package behavioral.Template;

import java.util.Date;
import java.util.Random;

public class LocalRepo extends UpdateGit{

    @Override
    public void beforeSave(Git git) {
        System.out.println("*****Before a Commit is made****");
        System.out.println("Owner: "+git.getName());
        System.out.println("Rpository: "+git.getProject());
        System.out.println("Pushing a new Commit and saving into logs");
    }

    @Override
    public void afterSave(Git git) {
        Random random =new Random();
        String chash=""+('a'+random.nextInt(26))+random.nextInt(26)+('a'+random.nextInt(26))+('a'+random.nextInt(26))+(random.nextInt(26))+(random.nextInt(26));
        final Date date=new Date(System.currentTimeMillis());
        System.out.println("****After Commit****");
        System.out.println("local -->[main]");
        System.out.println("new commit Added at\t\t"+date);
        System.out.println("Commit hash: "+chash+"\t");
    }
    
}
