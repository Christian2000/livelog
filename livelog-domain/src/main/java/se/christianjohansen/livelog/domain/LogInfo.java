package se.christianjohansen.livelog.domain;

import org.apache.commons.lang.Validate;

public class LogInfo {
    private final LogTag tag;
    private final String data;

    public LogInfo(LogTag tag, String data) {
        Validate.notNull(tag);
        Validate.notEmpty(data);

        this.tag = tag;
        this.data = data;
    }

    public LogTag getTag() {
        return tag;
    }

    public String getData() {
        return data;
    }
}
