package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        //zad 1
        helloWorld.printMessage();

        //zad2
        String myMessage = helloWorld.getMessages();
        System.out.println(myMessage);

        //zad3
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.send();

        //zad4
        MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();

        //zad5
        messageSender.sendMessageFromProperty();

        context.close();
    }
}
