package se.christianjohansen.livelog.domain;

import se.christianjohansen.livelog.domain.client.LoggingClient;

public class LogEntry {
    private LoggingClient loggingSystem;
    private String logMessage;
    private Long timestamp;
}
