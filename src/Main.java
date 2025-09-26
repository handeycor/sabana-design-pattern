import automotivecompany.AutomotiveClient;
import groupchat.ChatRoomClient;
import notifications.NotificationClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final AutomotiveClient automotiveClient = new AutomotiveClient();
        final NotificationClient notificationClient = new NotificationClient();
        final ChatRoomClient chatRoomClient = new ChatRoomClient();

        System.out.println();
        System.out.println("********Exercise 1: Automotive Company*********");
        System.out.println();

        automotiveClient.execute();

        System.out.println();
        System.out.println("********Exercise 2: Notifications*********");
        System.out.println();

        notificationClient.execute();

        System.out.println();
        System.out.println("********Exercise 3: Group Chat*********");
        System.out.println();

        chatRoomClient.execute();
    }
}