package IPC;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        ClientServer client = new ClientServer();
        client.startConnection("127.0.0.1", 3000);
        System.out.println(client.getServices());
        Scanner scanner = new Scanner(System.in);
        String request;
        while (true) {
            request = scanner.nextLine();
            if (!request.equalsIgnoreCase("quit")) {
                String response = client.sendMessage(request);
                System.out.println(response);
            } else {
                client.sendMessage("quit");
                break;
            }
        }
        client.stopConnection();
        scanner.close();
    }
}
