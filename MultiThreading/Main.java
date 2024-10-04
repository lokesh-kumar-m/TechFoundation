package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Admin admin=new Admin();
        Project project=admin.createTask("Achilies-SE", 10);
        Developers dev1=new Developers(project.getTasks(), "SE","lome");
        Developers dev2=new Developers(project.getTasks(), "SE","rore");
        Developers dev3=new Developers(project.getTasks(), "SE","vido");

        Thread thread1=new Thread(dev1);
        Thread thread2=new Thread(dev2);
        Thread thread3=new Thread(dev3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
