package it.brian.school.web.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 4321;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String clientMessage = inputMessage();

        System.out.println("Attempting connection to server " + SERVER_ADDRESS + ":" + SERVER_PORT);
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            writer.println(clientMessage);
            writer.flush();

            while (true) {
                String serverMessage = reader.readLine();
                if ("fine".equalsIgnoreCase(serverMessage)) {
                    System.out.println("Server has left the chat");
                    System.exit(0);
                }

                System.out.println("Client: " + serverMessage);

                clientMessage = inputMessage();
                if ("fine".equalsIgnoreCase(clientMessage)) {
                    System.out.println("You left the chat");
                    System.exit(0);
                }

                writer.println(clientMessage);
                writer.flush();


                reader.close();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static String inputMessage() {
        System.out.print("> ");
        return SCANNER.nextLine();
    }

}
