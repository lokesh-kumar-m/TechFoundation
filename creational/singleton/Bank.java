package creational.singleton;

public class Bank {
    public static void main(String[] args) {
        Account user1=Account.getInstance("lome");
        user1.addTransaction(1000);
        user1.addTransaction(300);
        user1.addTransaction(-500);
        user1.getTransactions();

        Account user2=Account.getInstance("rore");
        user2.addTransaction(3000);
        user2.addTransaction(500);
        user2.addTransaction(-100);
        user2.getTransactions();

        Account user3=Account.getInstance("lome");
        user3.getTransactions();
    }
}
