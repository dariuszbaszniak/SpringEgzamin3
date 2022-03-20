package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

@Controller
public class FreeTimeController {

    @GetMapping("/free-time")
    @ResponseBody
    public String checkTime(){
        String text = "";
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime day = LocalDateTime.of(2022, Month.MARCH, 21, 19, 10);

//        dataTime =
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

        if (day.getDayOfWeek() == dayOfWeek.SATURDAY || day.getDayOfWeek() == dayOfWeek.SUNDAY) {
            text = "Wolne";
        }
        else if ((day.getDayOfWeek() != dayOfWeek.SATURDAY || day.getDayOfWeek() != dayOfWeek.SUNDAY) && (day.getHour() > 8 && day.getHour() < 17 ) ) {
            text = "Pracuje, nie dzwoń";
        }
        else {
            text = "Po Pracy";
        }
        return text;
    }
}
