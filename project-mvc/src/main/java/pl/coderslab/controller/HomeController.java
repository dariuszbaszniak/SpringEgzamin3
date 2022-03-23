package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;


@Controller
@RequestMapping("/dziendobry")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //widoki
    //zad1
    @GetMapping("/helloView")
    public String helloView(){
        return "home";
    }

    //zad2
    @GetMapping("/helloView1")
    public String helloView(Model model){

//        int hour = LocalTime.now().getHour();
        int hour = 1;
        if (hour > 8 && hour < 20){
            model.addAttribute("color", "red");
            model.addAttribute("backgroundColor", "white");
        }
        else
        {
            model.addAttribute("color", "white");
            model.addAttribute("backgroundColor", "red");
        }


        return "home";
    }

    //zad1
    @GetMapping("/random/{max}")
    @ResponseBody
    public String getRandomMax(@PathVariable Integer max) {
        int random = new Random().nextInt(max) + 1;

        return String.format("Użytkownik podał wartość max %d. Wylosowano liczbę: %d.", max, random);
    }

    //zad2
    @GetMapping("/random/{max}/{min}")
    @ResponseBody
    public String getRandomMax(@PathVariable Integer max, @PathVariable Integer min) {
        int random = new Random().nextInt(max - min + 1) + min;

//        max = 10 min = 5, mozliwe wartosci 5,6,7,8,9,10;
//        jezeli nextInt(10) -> 0 - 9      +5 -> 5 do 14
//            10-5 -> 0 - 4   + 5 -> 5 do 9 Moze wam sie ta matematyka przyda, nie wiadomo

        return String.format("Użytkownik podał wartość min = %d i max = %d. Wylosowano liczbę: %d.", min, max, random);
    }


    //zad3
    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String getName(@PathVariable String firstName, @PathVariable String lastName) {

        return String.format("Witaj %s %s", firstName, lastName);
    }

    //zad4

//    @RequestMapping("/form")
    @GetMapping("/form")
    public String hello() {
        return "form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String getParamFromJsp(HttpServletRequest request){
        String paramName = request.getParameter("paramName");
        LocalDate localDate = LocalDate.parse(request.getParameter("paramDate"));

        System.out.println(localDate);
        System.out.println(paramName);

        return String.format("parametr ParamName = %s oraz data parsowana do localDate = %s", paramName, localDate);

    }

    @PostMapping("/form1")
    @ResponseBody
    public String getParamFromJsp(@RequestParam String paramName, @RequestParam String paramDate){

        LocalDate localDate = LocalDate.parse(paramDate);

        System.out.println(localDate);
        System.out.println(paramName);

        return String.format("parametr ParamName = %s oraz data parsowana do localDate = %s", paramName, localDate);

    }

    @GetMapping("/test-servlet-request")
    @ResponseBody
    public String getParamFromServletRequest(HttpServletRequest request) {
        return request.getParameter("query");
    }

    @GetMapping("/test-request-param")
    @ResponseBody
    public String getParamFromRequestParam(@RequestParam("query2") String query2) {
        return query2;
    }

    @GetMapping("/test-request-param2")
    @ResponseBody
    public String getParamFromRequestParam2(@RequestParam String query3) {
        return query3;
    }

    @GetMapping("/test-request-param-with-default")
    @ResponseBody
    public String getParamFromRequestParamDefault(@RequestParam(defaultValue = "Nie podales nic do query4") String query4) {
        return query4;
    }

    @GetMapping("/test-request-param-with-required")
    @ResponseBody
    public String getParamFromRequestParamRequired(@RequestParam(required = true) String query5,
                                                   @RequestParam(required = false) String query6) {
        logger.info("Notuje wartosci parametru query");
        logger.info(query5);
        logger.info(query6);
        return "Sprawdz w konsoli czy cos sie wypisalo";
    }

    @GetMapping("/test-request-param-with-number")
    @ResponseBody
    public String getParamFromRequestParamNumber(@RequestParam Long number1,
                                                 @RequestParam Integer number2) {
        return String.valueOf(number1 + number2);
    }

    @GetMapping("/test/{number}/page")
    @ResponseBody
    public String getPathVariable(@PathVariable Long number) {
        return number.toString();
    }

    @GetMapping("/userAgn")
    @ResponseBody
    public String userAgent(@RequestHeader("user-agent") String userAgent) {
        return "user-agent = " + userAgent;
    }

/**
 * Znane metody http
 * GET
 @@ -23,29 +101,29 @@

 @GetMapping("/logs")
 @ResponseBody
 public String getLogs(){
 public String getLogs() {
 logger.debug("To jest log debugowy");
 logger.info("To jest log info, dodamy tutaj parametry {} <- cooo? {} ", "parametr1", 159);
 return "Logs should be in console";
 }


 //    @RequestMapping(value = "/response-encoding", produces = "text/plain;charset=UTF-8")
 //    @RequestMapping(value = "/response-encoding", produces = "text/plain;charset=UTF-8")
 @GetMapping("/body")
 @ResponseBody
 public String getBody(){
 public String getBody() {
 return "To jest bezpośrednia odpowiedź, nie będziemy szukać widoków";
 }


 //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
 //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
 @GetMapping("/hello")
 public String getHello(){
 public String getHello() {
 return "index.jsp";
 }

 @RequestMapping(value = "/bye", method = {RequestMethod.PUT, RequestMethod.PATCH})
 public String getBye(){
 public String getBye() {
 return "byebye.jsp";
 }
 **/
}