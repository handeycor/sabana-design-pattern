package notifications.implementation;

import notifications.gateway.PlatformGateway;

public class Web implements PlatformGateway {

    @Override
    public String getNotifications(final String content) {
        return "Web platform. - " + content;
    }

}
