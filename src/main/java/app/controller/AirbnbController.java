package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AirbnbController {

    @RequestMapping(value = {"/", "/index"})
    public String showWelcome() {
        return "index";
    }

}
