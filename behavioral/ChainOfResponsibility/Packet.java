package behavioral.ChainOfResponsibility;

public class Packet {
    private String sourceAddress;
    private String data;
    private String destinationAddress;
    
    public Packet(String sourceAddress, String data, String destinationAddress) {
        this.sourceAddress = sourceAddress;
        this.data = data;
        this.destinationAddress = destinationAddress;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }
    public String getData() {
        return data;
    }
    public String getDestinationAddress() {
        return destinationAddress;
    }

}
