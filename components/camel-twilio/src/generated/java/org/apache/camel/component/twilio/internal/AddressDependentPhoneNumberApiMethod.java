
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.address.DependentPhoneNumber;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.address.DependentPhoneNumber
 */
public enum AddressDependentPhoneNumberApiMethod implements ApiMethod {

    READER(
        com.twilio.rest.api.v2010.account.address.DependentPhoneNumberReader.class,
        "reader",
        arg("pathAddressSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.address.DependentPhoneNumberReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathAddressSid", String.class));

    private static final AddressDependentPhoneNumberApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private AddressDependentPhoneNumberApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(DependentPhoneNumber.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static AddressDependentPhoneNumberApiMethod fromValue(String value) throws IllegalArgumentException {
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
