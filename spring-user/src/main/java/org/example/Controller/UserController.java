package org.example.Controller;

import org.example.Model.User;
import org.example.Model.UserAddress;
import org.example.Model.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getList(){
        return userService.getUsers();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user){
        userService.add(user);
    }

    @RequestMapping(value = "/helloUser", method = RequestMethod.GET)
    public User helloUser(){
        return new User(3L, "Dariusz", "Baszniak", new UserAddress("Wrocław", "Strzegomska", "142"));
    }

    //z ćwiczeń
//    @RequestMapping(value = "/u/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public User getUserById1(@PathVariable("id") Long id) {
//        return this.userService.findById1(id).orElseThrow(() -> {
//            throw new ResponseStatusException(
//                    HttpStatus.NOT_FOUND, "entity not found"
//            );
//        });
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Long id){
        return userService.findById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    public void update(@RequestBody User user){
        System.out.println(user.getId());
        userService.update(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
