package org.example.Model;

import org.example.Interface.UserInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserService implements UserInterface {

    private List<User> users = new ArrayList<>();
    private static Long nextId = 3L;

    public UserService(){
        users.add(new User(1L, "Jan", "Kowalski", new UserAddress("Warszawa", "jakaś ulica", "10")));
        users.add(new User(2L, "Krzysztof", "Nowak", new UserAddress("Wrocław", "moja ulica", "142")));
    }

    @Override
    public List<User> getUsers() {
        //metoda 1
        return users;

    }

    @Override
    public void add(User user) {
        user.setId(nextId++);
        users.add(user);
    }

    //z ćwiczeń
//    public Optional<User> findById1(Long id){
//       return users.stream()
//                .filter(i -> i.getId().equals(id))
//                .findFirst();
//    }

    public User findById(Long id){

        //metoda 1
//        for(User user:users){
//            if (user.getId() == id){
//                return user;
//            }
//        }
//        return null;

        //metoda 2
        return users.stream()
                    .filter(u -> u.getId() == id)
                    .findFirst()
                    .get();
    }

    @Override
    public void update (User user) {
//        User u = findById(user.getId());
//        u.setLastName(user.getLastName());
//        u.setFirstName(user.getFirstName());

        // metoda 2
        users.stream()
                .filter(o -> o.getId()==user.getId())
                .findFirst()
                .ifPresent(o -> {
                    o.setFirstName(user.getFirstName());
                    o.setLastName(user.getLastName());
                    o.setUserAddress(user.getUserAddress());
                });
    }

    @Override
    public void delete(Long id) {
        //metoda 1
//        for(User user:users){
//            if (user.getId() == id){
//                users.remove(user);
//            }
//        }

        //metoda 2
        users.removeIf(o -> o.getId() == id);
    }

}
