package se.christianjohansen.livelog.domain.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import se.christianjohansen.livelog.domain.LogInfo;
import se.christianjohansen.livelog.domain.LogTag;

@Controller
public class LoggingController {

    private int numberOfEntries = 0;

    @RequestMapping(value = "/entry", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public
    @ResponseBody
    String addLogEntry(@RequestBody String logEntry) {
        numberOfEntries++;
        System.out.println(logEntry);
        return logEntry;
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public LogInfo getStatus() {

        return new LogInfo(new LogTag("Row"), "153");

        //return "Got " + numberOfEntries + (numberOfEntries == 1 ? " entry" : " entries") + " so far.";
    }
}
