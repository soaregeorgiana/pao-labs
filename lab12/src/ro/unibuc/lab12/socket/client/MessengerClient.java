package ro.unibuc.lab12.socket.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MessengerClient {

    public static void main(String[] args) {

        /*
        The client must know the hostname or IP of the machine on which the server is running and the port number on which the server is listening,
        and this way the client makes a connection request
        The client also needs to identify itself to the server so it binds to a local port number,
        assigned by the system, that it will use during this connection. We don't deal with this ourselves.
        This constructor only creates a new socket when the server has accepted the connection, otherwise,
        we will get a connection refused exception.
         */
        try (Socket client = new Socket("localhost", 6666)) {
             /*
            When successfully created we can then obtain input and output streams from it to communicate with the server:
             */
            DataOutputStream messageToBeSentStream = new DataOutputStream(client.getOutputStream());
            messageToBeSentStream.writeUTF("Hello!");
            messageToBeSentStream.close();

        } catch (IOException exception) {
            throw new RuntimeException("Connection to 6666 could not be established", exception);
        }
    }
}
