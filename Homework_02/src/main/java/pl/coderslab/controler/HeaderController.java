package pl.coderslab.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeaderController {

    @GetMapping("/showUserAgent")
    public String showUserAgent(Model model, @RequestHeader("user-agent") String userAgent){
        model.addAttribute("userAgentParam", userAgent);
        return "userAgent";
    }

}
