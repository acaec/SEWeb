package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        return "index";
    }
}
