package notifications.entity;

import notifications.domain.NotificationService;
import notifications.gateway.PlatformGateway;

public class Message extends NotificationService {

    public Message(PlatformGateway platformGateway) {
        super(platformGateway);
    }

    @Override
    public String createNotification(final String content) {
        return "Message notification: " + super.platformGateway.getNotifications(content);
    }
}
