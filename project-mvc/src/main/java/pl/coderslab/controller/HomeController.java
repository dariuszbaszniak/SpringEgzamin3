package pl.coderslab.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dziendobry")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/logs")
    @ResponseBody
    public String getLogs(){
        logger.debug("To jest log debbugowy");
        logger.info("To jest log info, dodamy tutaj parametry {} <- cooo? {} ", "parametr1", 159);
        return "logs should be is console";
    }

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String getHello(){
        return "index.jsp";
    }

    @RequestMapping(value = "/bye", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public String getBye(){
        return "byebye.jsp";
    }

    @RequestMapping(value = "/response-encoding", produces = "text/plain;charset=UTF-8")
    @GetMapping("/body")
    @ResponseBody
    public String getBody(){
        return "odpowiedź dla usera bezpośrednia";
    }
}
