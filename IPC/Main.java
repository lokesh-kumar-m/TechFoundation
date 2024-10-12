package IPC;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 3000);
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
