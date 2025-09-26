package groupchat.gateway;

import groupchat.entity.User;

public interface Mediator {
    void registerUser(User user);
    void sendMessage(String message, User sender);
}
