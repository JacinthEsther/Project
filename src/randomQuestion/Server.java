package randomQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(5431)) {
            System.out.println("server started");
            System.out.println(serverSocket.getLocalSocketAddress());
            Socket client;
            while (true) {
                client = serverSocket.accept();
                InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());
                BufferedReader clientMsg = new BufferedReader(inputStreamReader);
                System.out.println(clientMsg.readLine());
            }
        }
    }
}
