package lesson_six;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        System.out.println("Server strted");
        try (ServerSocket serverSocket = new ServerSocket(8189);
                Socket socket = serverSocket.accept()) {
            System.out.println("Client connected");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String msg = in.readUTF();
                out.writeUTF("echo: " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
