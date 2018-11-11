package com.tsekhanovich.masterclass.networking;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author Pavel Tsekhanovich 09.11.2018
 */

public class EchoServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {

            while (true) {
                new Echoer(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
}
