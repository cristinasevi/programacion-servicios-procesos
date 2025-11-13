package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public void start(int port) throws IOException {
        System.out.println("EchoServer start");
        ServerSocket serverSocket = new ServerSocket(port);

        Socket client;
        while (true) {
            client = serverSocket.accept();

            // En Terminal del local poner: ncat -4 localhost 3000
            System.out.println("EchoServer accept");

            new EchoThread(client).start();
        }
    }
}
