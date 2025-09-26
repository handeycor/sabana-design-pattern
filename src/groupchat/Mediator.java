package groupchat;

public interface Mediator {
    void registerUser(User user);
    void sendMessage(String message, User sender);
}
