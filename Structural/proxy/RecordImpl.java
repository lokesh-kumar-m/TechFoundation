package Structural.proxy;

import java.util.HashMap;

public class RecordImpl implements Records{

    private HashMap<String, Double> hashMap=new HashMap<>();

    @Override
    public double readDocs(String name) {
        if(hashMap.containsKey(name)){
            return hashMap.get(name);
        }
        hashMap.put(name, Math.random());
        return hashMap.get(name);
    }

    @Override
    public void printDB() {
        System.out.println(hashMap);
    }
    
    @Override
    public void scram(){
        hashMap.clear();
    }
    
}
