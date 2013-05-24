package se.christianjohansen.livelog.domain;

import se.christianjohansen.livelog.domain.client.LoggingClient;

import java.util.Set;

class LogEntry {
    private LoggingClient loggingSystem;
    private String logMessage;
    private Long timestamp;
    private Set<LogInfo> logInfoSet;
}
