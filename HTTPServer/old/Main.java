package com.company;

import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        final HTTPServer server = new HTTPServer(8080);
        server.setPath("C:\\Tmp");
        server.start();

        System.out.println("Server started...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                server.stop();
                System.out.println("Server stopped!");
            }
        });
    }
}