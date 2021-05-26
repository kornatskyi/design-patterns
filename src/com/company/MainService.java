package com.company;

public class MainService {
    public void sendEmail() {
        connect();
        authenticate();
        disconnect();
    }

    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
