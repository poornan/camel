
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.drive.Drive$Channels
 */
@UriParams(apiName = "drive-channels")
@Configurer
public final class DriveChannelsEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    private com.google.api.services.drive.model.Channel contentChannel;

    public com.google.api.services.drive.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.drive.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }
}
