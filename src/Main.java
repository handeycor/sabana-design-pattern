import automotivecompany.AutomotiveClient;
import notifications.NotificationClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final AutomotiveClient automotiveClient = new AutomotiveClient();
        final NotificationClient notificationClient = new NotificationClient();

        automotiveClient.execute();

        System.out.println("********Notification*********");
        notificationClient.execute();
    }
}