package Structural.proxy;

import java.util.HashMap;

public class ProxyRecordImpl implements Records {

    private HashMap<String,Double> proxymap=new HashMap<>();
    private RecordImpl recordImpl;

    public ProxyRecordImpl(RecordImpl recordImpl) {
        this.recordImpl = recordImpl;
    }

    @Override
    public double readDocs(String name) {
        if(proxymap.containsKey(name)){
            System.out.println("proxy");
            return proxymap.get(name);
        }
        double re=recordImpl.readDocs(name);
        proxymap.put(name, re);
        return re;
    }

    @Override
    public void printDB() {
        System.out.println("proxy");
        System.out.println(proxymap);
    }
    
    public void scram(){
        proxymap.clear();
        recordImpl.scram();
    }
}
