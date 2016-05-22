package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Controller
@Path("/users")

public class UserController {

    @RequestMapping(value = "/registration")
    public String register() {

        return "registration";
    }

    @GET
    @Produces("text/plain")
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
