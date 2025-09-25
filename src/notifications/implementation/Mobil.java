package notifications.implementation;

import notifications.gateway.PlatformGateway;

public class Mobil implements PlatformGateway {

    @Override
    public String getNotifications(final String content) {
        return "Movil platform. - " + content;
    }
}
