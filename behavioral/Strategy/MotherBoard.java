package behavioral.Strategy;

import behavioral.Strategy.GPU.GPU;
import behavioral.Strategy.Memory.Memory;
import behavioral.Strategy.Processors.Processor;

public class MotherBoard {
    private GPU gpu;
    private Processor processor;
    private Memory memory;

    public MotherBoard(GPU gpu, Processor processor, Memory memory) {
        this.gpu = gpu;
        this.processor = processor;
        this.memory = memory;
    }

    public void addGpu(){
        gpu.add();
    }
    public void addProcessor(){
        processor.add();
    }
    public void addMemory(){
        memory.insertAll();
    }
    
}
