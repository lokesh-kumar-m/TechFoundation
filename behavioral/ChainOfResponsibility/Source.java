package behavioral.ChainOfResponsibility;

public class Source {
    public static void main(String[] args) {
        RequestHandler lan=new Lan();
        RequestHandler router= new Router();
        RequestHandler systemGroupA= new SystemGroupA();
        RequestHandler systemGroupB= new SystemGroupB();

        lan.setNextHandler(router);
        router.setNextHandler(systemGroupA);
        // router.setNextHandler(systemGroupB);

        Packet packet1=new Packet("Office", "Hello! How much work did you complete?", "176.2.4.120");
        Packet packet2=new Packet("Office", "FYI, It's high prio, Complete ASAP", "176.2.4.120");
        Packet packet3=new Packet("Office", "Hello! Can I get Access to this?", "176.2.9.120");
        Packet packet4=new Packet("Office", "See ya!", "176.2.10.120");

        lan.checkRequest(packet1);
        System.out.println("==========Next req==========");
        lan.checkRequest(packet2);
        System.out.println("==========Next req==========");
        lan.checkRequest(packet3);
        System.out.println("==========Next req==========");
        lan.checkRequest(packet4);
    }
}
