package Structural.proxy;

public class Client {
    public static void main(String[] args) {
        ProxyRecordImpl records=new ProxyRecordImpl(new RecordImpl());

        records.readDocs("finole");
        records.readDocs("lome");
        records.readDocs("rore");
        records.readDocs("lome");
        records.printDB();
        records.scram();
    }
}
