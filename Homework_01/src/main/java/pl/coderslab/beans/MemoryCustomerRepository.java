package pl.coderslab.beans;

import org.springframework.stereotype.Component;
import pl.coderslab.Customer;
import pl.coderslab.CustomerLogger;
import pl.coderslab.CustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MemoryCustomerRepository implements CustomerRepository {

    private CustomerLogger customerLogger;

    private Map<Integer, Customer> customerMap;

    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
        this.customerMap = new HashMap<>();
    }

    @Override
    public void addClient(Customer customer) {
        customerLogger.log();
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void removeClient(Integer id) {
        customerLogger.log();
        customerMap.remove(id);
    }

    @Override
    public void listClient() {
        customerLogger.log();
        customerMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
