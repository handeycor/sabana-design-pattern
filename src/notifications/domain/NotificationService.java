package notifications.domain;

import notifications.gateway.PlatformGateway;

public abstract class NotificationService {

    protected final PlatformGateway platformGateway;
    public NotificationService(PlatformGateway platformGateway) {
        this.platformGateway = platformGateway;
    }

    public abstract String createNotification(String content);
}
