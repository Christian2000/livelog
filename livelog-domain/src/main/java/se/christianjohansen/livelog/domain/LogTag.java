package se.christianjohansen.livelog.domain;

import org.apache.commons.lang.Validate;

public class LogTag {
    private final String tag;

    public LogTag(String tag) {
        Validate.notEmpty(tag);
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "LogTag{" +
                "tag='" + tag + '\'' +
                '}';
    }
}
