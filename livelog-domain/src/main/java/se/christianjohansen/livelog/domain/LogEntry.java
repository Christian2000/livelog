package se.christianjohansen.livelog.domain;

import se.christianjohansen.livelog.domain.client.LoggingClient;

import java.util.Set;

public class LogEntry {
    private LoggingClient loggingSystem;
    private String logMessage;
    private Long timestamp;
    private Set<LogInfo> logInfoSet;
}
