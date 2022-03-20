package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.FileCustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        SimpleCustomerLogger simpleCustomerLogger = context.getBean("simpleCustomerLogger", SimpleCustomerLogger.class);
//        SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);
//        simpleCustomerLogger.log();

        FileCustomerLogger fileCustomerLogger = context.getBean(FileCustomerLogger.class);

//        fileCustomerLogger.setFilename("log.txt");
//        fileCustomerLogger.log();

        Customer customer1 = new Customer(1, "Jan", "Kowalski" );
        MemoryCustomerRepository memoryCustomerRepository = context.getBean("memoryCustomerRepository", MemoryCustomerRepository.class);

        memoryCustomerRepository.addClient(customer1);
        memoryCustomerRepository.listClient();

        memoryCustomerRepository.removeClient(1);
        memoryCustomerRepository.listClient();


    }
}
