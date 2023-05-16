package it.brian.school.web.clock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ClockServer {

    private static final int PORT = 4321;

    public static void main(String[] args) throws IOException {
        try (ServerSocket listenerSocket = new ServerSocket(PORT)) {
            while (true) {
                System.out.println("ClockServer listening on port " + PORT);
                Socket currentSocket = listenerSocket.accept();
                System.out.println("Connection accepted with " + currentSocket.getInetAddress().getHostAddress());
                PrintWriter writer = new PrintWriter(currentSocket.getOutputStream());
                writer.println("Server DateTime = " + new Date());
                writer.close();
            }
        }

    }
}
