package IPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataServer {
    private ServerSocket serverSocket;
    private HashMap<String,List<Integer>> userdata=new HashMap<>();
    
    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started and listening on port:"+port);
            while (true) {
                new Thread(new ClientHandler(serverSocket.accept())).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DataServer server = new DataServer();
        server.start(3000);
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
        private boolean getFlag,delFlag,addFlag;

        public ClientHandler(Socket socket) {
            clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println("New client connected");
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                ArrayList<String> greet=new ArrayList<>();
                greet.add("Greetings!! ");
                greet.add("services I offer: get, add, delete");
                out.println(greet);
                out.flush();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("new req from "+clientSocket.getRemoteSocketAddress()+" :"+ inputLine);
                    if("get".equalsIgnoreCase(inputLine) || "delete".equalsIgnoreCase(inputLine) || "add".equalsIgnoreCase(inputLine)){
                        out.println("Server: Please enter your name");
                        if("get".equalsIgnoreCase(inputLine)){
                            getFlag=true;
                        }else if("delete".equalsIgnoreCase(inputLine)){
                            delFlag=true;
                        }else{
                            addFlag=true;
                        }
                    }
                    else if(getFlag){
                        if(userdata.get(inputLine)!=null){
                            out.println("Server: " + userdata.get(inputLine));
                        }else{
                            out.println("Server: No Data found!");
                        }
                        getFlag=!getFlag;
                    }
                    else if(delFlag){
                        if(userdata.containsKey(inputLine)){
                            userdata.remove(inputLine);
                            out.println("Server: Data Removed");
                        }
                        delFlag=!delFlag;
                    }
                    else if(addFlag){
                        if(userdata.containsKey(inputLine)){
                            userdata.get(inputLine).add(null);
                        }else{
                            String name=inputLine.substring(0, inputLine.indexOf(" "));
                            String[] data=inputLine.substring(inputLine.indexOf(" ")+1, inputLine.length()).split(",");
                            List<Integer> lst=new ArrayList<>();
                            for (String str : data) {
                                lst.add(Integer.parseInt(str));
                            }
                            userdata.put(name, lst);
                            out.println("Server: New record Added");
                        }
                        out.print("Server: Data Added!");
                        addFlag=!addFlag;
                    }
                    else if ("quit".equalsIgnoreCase(inputLine)) {
                        System.out.println("Connection Terminated");
                        break;
                    }
                    else {
                        // System.out.println(inputLine);
                        out.println("Server:"+inputLine );
                    }
                }
            } catch (IOException e) {
                System.out.println("Connection terminated");
                // e.printStackTrace();
            } finally {
                try {
                    in.close();
                    out.close();
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
