package se.christianjohansen.livelog.domain.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoggingController {
    @RequestMapping(value = "/entry", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String addLogEntry(@RequestBody String logEntry){
        System.out.println(logEntry);
        return logEntry;
    }
}
