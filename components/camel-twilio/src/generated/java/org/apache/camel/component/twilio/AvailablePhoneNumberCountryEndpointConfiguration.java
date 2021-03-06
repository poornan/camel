
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountry
 */
@UriParams(apiName = "available-phone-number-country")
@Configurer
public final class AvailablePhoneNumberCountryEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The SID of the Account requesting the available phone number Country resource")
    private String pathAccountSid;
    @UriParam(description = "The ISO country code of the country to fetch available phone number information about")
    private String pathCountryCode;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCountryCode() {
        return pathCountryCode;
    }

    public void setPathCountryCode(String pathCountryCode) {
        this.pathCountryCode = pathCountryCode;
    }
}
