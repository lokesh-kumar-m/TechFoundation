package creational.singleton;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private static Map<String,Account> objectInstances=new HashMap<>();
    private Map<String,Integer> transactions;
    private String name;
    private long incrementer=0;

    private Account(String name){
        this.name=name;
        this.transactions=new HashMap<>();
    }

    public static synchronized Account getInstance(String name){
        if(!objectInstances.containsKey(name)){

            objectInstances.put(name, new Account(name));
        }
        return objectInstances.get(name);
    }

    public void getTransactions(){
        System.out.println();
        System.out.println("User: "+name);
        for(Map.Entry<String,Integer> record: transactions.entrySet()){
            System.out.println(record.getKey()+"--"+record.getValue());
        }
    }

    public void addTransaction(int amount){
        incrementer+=1;
        String keyVal=LocalTime.now().toString()+incrementer+ (amount>0?" credit":" debit");
        transactions.put(keyVal,amount);
    }
}
