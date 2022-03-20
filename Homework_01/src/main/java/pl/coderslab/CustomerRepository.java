package pl.coderslab;

public interface CustomerRepository {

    void addClient(Customer customer);
    void removeClient(Integer id);
    void listClient();
}
