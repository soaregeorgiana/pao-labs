package ro.unibuc.lab12.socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MessengerServer {

    public static void main(String[] args) {

        /*
        Usually, a server runs on a specific computer on the network and has a socket that is bound to a specific port number.
        In our case, we use the same computer as the client and started the server on port 6666:
         */
        try (ServerSocket serverSocket = new ServerSocket(6666)) {
            System.out.println("The server is running on: " + serverSocket.getLocalPort());

            while (true) {
                /*
                The server just waits, listening to the socket for a client to make a connection request
                When the server code encounters the accept method, it blocks until a client makes a connection request to it.
                */
                Socket client = serverSocket.accept();
                /*
                If everything goes well, the server accepts the connection.
                Upon acceptance, the server gets a new socket, clientSocket, bound to the same local port, 8081,
                and also has its remote endpoint set to the address and port of the client.
                At this point, the new Socket object puts the server in direct connection with the client,
                we can then access the output and input streams to write and receive messages to and from the client respectively:
                 */
                DataInputStream receivedMessageStream = new DataInputStream(client.getInputStream());
                System.out.println(receivedMessageStream.readUTF());
                receivedMessageStream.close();
            }

        } catch (IOException exception) {
            throw new RuntimeException("Connection to 6666 could not be established", exception);
        }
    }

}
