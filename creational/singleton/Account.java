package creational.singleton;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private static Map<String,Account> objectInstances=new HashMap<>();
    private Map<String,Integer> transactions;
    private String name;
    private long incrementer=0;
    private long currentBalance;

    private Account(String name){
        this.name=name;
        this.transactions=new HashMap<>();
        this.currentBalance=0;
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

    public String addTransaction(int amount){
        if(currentBalance+amount>=0){
            currentBalance+=amount;
        }else{
            return "Invalid transaction";
        }
        incrementer+=1;
        String keyVal=LocalTime.now().toString()+incrementer+ (amount>0?" credit":" debit");
        //add new current balace
        transactions.put(keyVal,amount);
        return keyVal;
    }
 
}
