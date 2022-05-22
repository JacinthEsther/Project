package randomQuestion;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) throws IOException{
        System.out.println("establishing connection...");
        Socket socket = new Socket("192.168.43.24", 5431);
        System.out.println(socket.getLocalAddress());
        System.out.println("connection established");
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());
        System.out.println("enter sentence");
        String sentence = fromUser.readLine();
        outToServer.writeBytes(sentence + "\n");
        socket.close();
    }
}
