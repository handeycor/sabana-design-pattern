package groupchat.entity;

import groupchat.gateway.Mediator;

public class User {

    private final String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator; // inyección
    }

    public void send(String message) {
        System.out.println(name + " envió: " + message);
        System.out.println();
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " recibió: " + message);
    }
}
