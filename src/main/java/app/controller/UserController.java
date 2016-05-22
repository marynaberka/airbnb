package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/registration")
    public String register() {

        return "registration";
    }

    public String getAll() {
        return "Get All!";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/becomeHost")
    public String becomeHost() {
        return "becomeHost";
    }

}
