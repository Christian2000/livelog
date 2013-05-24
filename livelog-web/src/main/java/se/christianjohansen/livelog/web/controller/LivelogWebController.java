package se.christianjohansen.livelog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class LivelogWebController {
    @RequestMapping({"/welcome","/index"})
    public String get(Map<String, Object> model){
        model.put("msg","Hello world");
        return "HelloWorldPage";
    }
}
