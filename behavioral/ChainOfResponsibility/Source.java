package behavioral.ChainOfResponsibility;

import behavioral.ChainOfResponsibility.Handlers.Lan;
import behavioral.ChainOfResponsibility.Handlers.Router1;
import behavioral.ChainOfResponsibility.Handlers.Router2;
import behavioral.ChainOfResponsibility.Handlers.SystemGroupA;
import behavioral.ChainOfResponsibility.Handlers.SystemGroupB;

public class Source {
    public static void main(String[] args) {
        RequestHandler lan=new Lan();
        RequestHandler router1=new Router1();
        RequestHandler router2=new Router2();
        RequestHandler systemGroupA= new SystemGroupA();
        RequestHandler systemGroupB= new SystemGroupB();
    
        lan.setNextHandler(router1,true);
        lan.setNextHandler(router2, false);
        router1.setNextHandler(systemGroupA,true);
        router1.setNextHandler(systemGroupB, false);
        // router.setNextHandler(systemGroupB);

        Packet packet1=new Packet("Office", "Hello! How much work did you complete?", "176.2.4.120");
        Packet packet2=new Packet("Office", "FYI, It's high prio, Complete ASAP", "176.2.4.120");
        Packet packet3=new Packet("Office", "Hello! Can I get Access to this?", "178.2.9.120");
        Packet packet4=new Packet("Office", "See ya!", "176.7.10.120");
        Packet packet5=new Packet("Home", "Come online", "196.172.7.16"); 

        System.out.println("==========Packet1 request==========");
        lan.checkRequest(packet1);
        System.out.println();
        System.out.println("==========Packet2 request==========");
        lan.checkRequest(packet2);
        System.out.println();
        System.out.println("==========Packet3 request==========");
        lan.checkRequest(packet3);
        System.out.println();
        System.out.println("==========Packet4 request==========");        
        lan.checkRequest(packet4);
        System.out.println();
        System.out.println("==========Packet5 request==========");
        lan.checkRequest(packet5);
    }
}
