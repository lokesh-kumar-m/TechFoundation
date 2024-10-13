package DSA.Array;


public class ArrayImpl {
    private int initCapacity=8;
    private User[] arrayList;
    private int varCapacity=initCapacity;
    private int currentIdx=0;

    public ArrayImpl(){
        this.arrayList=new User[initCapacity];
    }
    public ArrayImpl(int size){
        this.arrayList=new User[size];
    }

    public void add(User user){
        if(isAvailable()){
            arrayList[currentIdx]=user;
            currentIdx++;
        }
    }
    
    public void delete(User user){
        boolean isFound=false;
        for(int i=0;i<=currentIdx;i++){
            if(arrayList[i]==user){
                isFound=true;
                int j=i;
                while(j<currentIdx){
                    arrayList[j]=arrayList[j+1];
                    j++;
                }currentIdx--;
            }
        }
        if(!isFound){
            System.out.println("Element does not exist");
        }
    }
    public void clear(){
        arrayList=new User[initCapacity];
    }
    public boolean isAvailable(){
        if((varCapacity-currentIdx)>=0){
            return true;
        }else{
            varCapacity=varCapacity<<1;
            User[] tempList=new User[varCapacity];
            for(int i=0;i<currentIdx+1;i++){
                tempList[i]=arrayList[i];
            }
            arrayList=tempList;
            return true;
        }
    }
    public User find(int idx){
        for(int i=0;i<=currentIdx;i++){
            if(i==idx){
                return arrayList[i];
            }
        }
        return null;
    }
}
