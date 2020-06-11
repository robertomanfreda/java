package com.github.robertomanfreda.java13.niosocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketChannelClient {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8888)){

            boolean running = true;
            while(running){
                System.out.println("********* andare su localhost:8888 ********");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connesso = " + clientSocket.isConnected());
                System.out.println(clientSocket.getRemoteSocketAddress());
                running = false;
                clientSocket.close();
                System.out.println(clientSocket.isClosed());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}