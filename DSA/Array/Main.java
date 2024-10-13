package DSA.Array;

public class Main {
    public static void main(String[] args) {
        ArrayImpl array=new ArrayImpl();
        User user1=new User("lome");
        User user2=new User("rore");
        User user3=new User("sakn");
        User user4=new User("bhma");
        User user5=new User("dine");
        User user6=new User("vido");
        User user7=new User("such");
        User user8=new User("bhsa");
        User user9=new User("atve");
        array.add(user1);
        array.add(user2);
        array.add(user3);
        array.add(user4);
        array.add(user5);
        array.add(user6);
        array.add(user7);
      
        array.delete(user3);
        
        array.add(user8);
        array.add(user9);
        for(int i=0;i<9;i++){
            System.out.println(array.find(i).getName());
        }
        // array.add(user8);
   } 
}
