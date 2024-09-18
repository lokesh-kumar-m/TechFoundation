package behavioral.Strategy;

import java.util.Scanner;

import behavioral.Strategy.GPU.AMD;
import behavioral.Strategy.GPU.GPU;
import behavioral.Strategy.GPU.Nvidia;
import behavioral.Strategy.Memory.Corsair;
import behavioral.Strategy.Memory.Klevv;
import behavioral.Strategy.Memory.Memory;
import behavioral.Strategy.Processors.AMD_R_7900;
import behavioral.Strategy.Processors.AMD_R_9750X;
import behavioral.Strategy.Processors.Intel_Core_i7;
import behavioral.Strategy.Processors.Intel_Core_i9;
import behavioral.Strategy.Processors.Processor;

public class Client {
    public static void main(String[] args) {
        Processor processor;
        GPU gpu;
        Memory memory;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select processor option");

        System.out.println("1.AMD");
        System.out.println("2.Intel");
        int brandChoice= scanner.nextInt();
        if(brandChoice==1){
            System.out.println("1.for work");
            System.out.println("2.for games");
            int choice=scanner.nextInt();
            if(choice ==1){
                processor= new AMD_R_7900();
            }else{
                processor=new AMD_R_9750X();
            }
        }else{
            System.out.println("1.for work");
            System.out.println("2.for games");
            int choice=scanner.nextInt();
            if(choice ==1){
                processor= new Intel_Core_i7();
            }else{
                processor=new Intel_Core_i9();
            }
        }
        System.out.println("Select Memory Chips option");
        System.out.println("1.Corsair");
        System.out.println("2.klevv");
        int memChoice=scanner.nextInt();
        if(memChoice==1){
            memory= new Corsair();
        }else{
            memory= new Klevv();
        }
        System.out.println("select Graphic cards option");
        System.out.println("1.Nvidia");
        System.out.println("2.AMD");
        int gChoice=scanner.nextInt();
        if(gChoice==1){
            gpu=new Nvidia();
        }else{
            gpu=new AMD();
        }
        MotherBoard motherBoard= new MotherBoard(gpu, processor, memory);
        motherBoard.addProcessor();
        motherBoard.addMemory();
        motherBoard.addGpu();
        System.out.println("Your new Desktop is ready");
        scanner.close();
    }
}
