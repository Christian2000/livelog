package se.christianjohansen.livelog.domain.client;

import org.apache.commons.lang.Validate;

public class LoggingClient {
    private final String clientIdentifier;

    public LoggingClient(String clientIdentifier) {
        Validate.notEmpty(clientIdentifier);
        this.clientIdentifier = clientIdentifier;
    }
}
