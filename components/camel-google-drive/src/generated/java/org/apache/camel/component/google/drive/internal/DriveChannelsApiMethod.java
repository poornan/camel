
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.google.api.services.drive.Drive.Channels;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.google.api.services.drive.Drive$Channels
 */
public enum DriveChannelsApiMethod implements ApiMethod {

    STOP(
        com.google.api.services.drive.Drive.Channels.Stop.class,
        "stop",
        arg("contentChannel", com.google.api.services.drive.model.Channel.class));

    private static final DriveChannelsApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private DriveChannelsApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Channels.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static DriveChannelsApiMethod fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].getName().equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
