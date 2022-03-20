package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.SimpleCustomerLogger;

@Configuration
@ComponentScan("pl.coderslab.beans")
public class AppConfig {


    @Bean("NazwaBean")
    public String filename(){
        return "dzień dobry strzykam string";
    }
//    @Bean("simpleCustomerLogger")
//    public SimpleCustomerLogger simpleCustomerLogger(){
//        return new SimpleCustomerLogger();
//    }

}
