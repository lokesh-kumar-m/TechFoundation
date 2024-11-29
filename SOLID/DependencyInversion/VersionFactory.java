package SOLID.DependencyInversion;

import java.util.HashMap;
import java.util.Map;

import SOLID.DependencyInversion.Versions.IVersion;
import SOLID.DependencyInversion.Versions.Sequoia;
import SOLID.DependencyInversion.Versions.Sonoma;

public class VersionFactory {
    private HashMap<String,IVersion> versions;

    public VersionFactory(){
        versions=new HashMap<>();
        versions.put("v1", new Sequoia());
        versions.put("v2", new Sonoma());
    }
    public IVersion createVersion(String versionkey){
        if(versions.containsKey(versionkey)){
            return versions.get(versionkey);
        }else{
            return null;
        }
    }
    public void printVersion(){
        for(Map.Entry<String,IVersion> map:versions.entrySet()){
            System.out.println("Versions: "+map.getKey());
        }
    }
}
