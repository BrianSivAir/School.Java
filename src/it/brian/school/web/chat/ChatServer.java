package it.brian.school.web.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

    private static final int PORT = 4321;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (ServerSocket listenerSocket = new ServerSocket(PORT)) {
            while (true) {
                System.out.println("ChatServer listening on port " + PORT);
                Socket socket = listenerSocket.accept();
                System.out.println("Connection accepted with " + socket.getInetAddress().getHostAddress());



                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream());

                String clientMessage = reader.readLine();
                if ("fine".equalsIgnoreCase(clientMessage)) {
                    System.out.println("Client has left the chat");
                    break;
                }

                System.out.println("Client: " + clientMessage);

                String serverMessage = inputMessage();
                if ("fine".equalsIgnoreCase(serverMessage)) {
                    System.out.println("You left the chat");
                    break;
                }

                writer.println(serverMessage);
                writer.flush();

                writer.close();
            }
        }
    }

    private static String inputMessage() {
        System.out.print("> ");
        return SCANNER.nextLine();
    }

}
