package groupchat;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator{

    private final List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(message);
            }
        }
    }
}
