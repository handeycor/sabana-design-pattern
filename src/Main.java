import automotivecompany.AutomotiveClient;
import groupchat.ChatRoom;
import groupchat.Mediator;
import groupchat.User;
import notifications.NotificationClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("********Exercise 1: Automotive Company*********");
        System.out.println();

        final AutomotiveClient automotiveClient = new AutomotiveClient();
        final NotificationClient notificationClient = new NotificationClient();

        automotiveClient.execute();

        System.out.println();
        System.out.println("********Exercise 2: Notifications*********");
        System.out.println();

        notificationClient.execute();

        System.out.println();
        System.out.println("********Exercise 3: Group Chat*********");
        System.out.println();

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