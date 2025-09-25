package notifications;

import notifications.entity.Alert;
import notifications.entity.Message;
import notifications.implementation.Mobil;
import notifications.implementation.Web;

public class NotificationClient {
    public void execute() {
        final Mobil mobil = new Mobil();
        final Web web = new Web();

        final Alert mobilAlert = new Alert(mobil);
        System.out.println();
        String alertMobNotification = mobilAlert.createNotification("Low Battery!!!");
        System.out.println(alertMobNotification);

        final Message mobilMessage = new Message(mobil);
        System.out.println();
        String messageMobileNotification = mobilMessage.createNotification("This is an example message notification!!!");
        System.out.println(messageMobileNotification);

        final Alert webAlert = new Alert(web);
        System.out.println();
        String alertWebNotification = webAlert.createNotification("This is an example alert notification!!!");
        System.out.println(alertWebNotification);

        final Message webMessage = new Message(web);
        System.out.println();
        String messageWebNotification = webMessage.createNotification("This is an example message notification!!!");
        System.out.println(messageWebNotification);

    }
}
