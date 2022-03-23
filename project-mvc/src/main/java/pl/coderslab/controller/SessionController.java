package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller

public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String getSessionValue(HttpSession session) {
        if (session.getAttribute("loginStart") == null) {
            session.setAttribute("loginStart", LocalDateTime.now().toString());
        }
        return session.getAttribute("loginStart").toString();
    }

}
