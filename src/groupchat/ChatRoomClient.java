package groupchat;

import groupchat.domain.ChatRoom;
import groupchat.entity.User;
import groupchat.gateway.Mediator;

public class ChatRoomClient {

    public void execute() {
        Mediator chatRoom = new ChatRoom();

        User user1 = new User("Alexy", chatRoom);
        User user2 = new User("Harver", chatRoom);
        User user3 = new User("Juan", chatRoom);
        User user4 = new User("Karen", chatRoom);

        chatRoom.registerUser(user1);
        chatRoom.registerUser(user2);
        chatRoom.registerUser(user3);
        chatRoom.registerUser(user4);

        user1.send("Hola a todos!");

        System.out.println();
    }
}
