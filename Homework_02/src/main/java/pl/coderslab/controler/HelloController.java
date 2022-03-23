package pl.coderslab.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/workersAction")
    public String workersAction(Model model) {
        Integer random = new Random().nextInt(5) + 1;
        System.out.println("random: " +random);

        String file = "C:\\\\NETIA\\\\prv\\\\coderslab\\\\GIT\\\\Homework_02\\\\workers.txt";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
                String[] v = line.split(",");
                if (v[0].equals(random.toString())){
//                    System.out.println("ss: " +v[0] +" " + v[1]);
                    logger.info("Wylosowana liczba random {} -> osoba znaleziona {}", random, v[1]);
                    model.addAttribute("name", v[1]);
                }

            }
        } catch (FileNotFoundException e){
            System.out.println("brak pliku");
        } catch (IOException e) {
            e.printStackTrace();
        }



        return "workers";
    }

}
