package se.christianjohansen.livelog.domain.client;

import org.apache.commons.lang.Validate;

public class LoggingClient {
    private String clientIdentifier;

    public LoggingClient(String clientIdentifier) {
        Validate.notEmpty(clientIdentifier);
        this.clientIdentifier = clientIdentifier;
    }
}
