import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class Server {
    ServerSocket server;
    int serverPort = 9090;
    ArrayList<Thread> threads = new ArrayList<Thread>();
    int limit = 100;
    HashMap<String, ClientManager> clientsMap = new HashMap<String, ClientManager>();

    public Server() {
        try {
            server = new ServerSocket(serverPort);
            System.out.println("Server Created!");

            while (true) {
                Socket client = server.accept();

                System.out.println("Connected to New Client!");

                Thread t = new Thread(new ClientManager(this,client));
                threads.add(t);

                if (threads.size() > limit) {
                    System.out.println("Server has reached its limit.");
                }

                t.start();
            }
        } catch (IOException e) {

        }

    }

    public void addClientManager(String clientName,ClientManager cm){
        clientsMap.put(clientName, cm);
    }

    public static void main(String[] args) {
        new Server();
    }
}
