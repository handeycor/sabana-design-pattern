package notifications.entity;

import notifications.domain.NotificationService;
import notifications.gateway.PlatformGateway;

public class Alert extends NotificationService {

    public Alert(PlatformGateway platformGateway) {
        super(platformGateway);
    }

    @Override
    public String createNotification(final String content) {
        return "Alert notification: " + super.platformGateway.getNotifications(content);
    }
}
