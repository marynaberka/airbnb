package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AirbnbController {

    @RequestMapping(value = {"/", "/index"})
    public String showWelcome() {
        return "index";
    }

    @RequestMapping(value = "/registration")
    public String register(){
        return "registration";
    }

}
