package it.brian.school.web.clock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClockClient {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 4321;

    public static void main(String[] args) {
        System.out.println("Attempting connection to server " + SERVER_ADDRESS + ":" + SERVER_PORT);
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverDateTime = reader.readLine();
            System.out.println(serverDateTime);
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
