package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

@Controller
public class WelcomeController extends HttpServlet {

    @RequestMapping("index")
    public String welcome() {
        return "index";
    }

}
