public class Main {
    public static void main(String[] args) {
        Details person1=new DetailsBuilder()
                                .setName("lome")
                                .setAge(25)
                                .setInterstConflict(false)
                                .build();

        System.out.println(person1);

        Details person2=new DetailsBuilder()
                            .setName("Bala Naga Someshwara Venkata Brewski")
                            .setPreferredName("Brewski")
                            .setAge(30)
                            .setWorking(true)
                            .setCurrentLpa(12.8)
                            .setInterstConflict(true)
                            .build();

        System.out.println(person2);
    }
}
