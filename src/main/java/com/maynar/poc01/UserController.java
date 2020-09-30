package com.maynar.poc01;

import com.maynar.poc01.model.User;
import com.maynar.poc01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        if(user != null) {
            userService.create(user);
            return "Added a user";
        } else {
            return "Request does not contain a body";
        }
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable long id){
        if(id > 0) {
            if(userService.delete(id)) {
                return "Deleted the user.";
            } else {
                return "Cannot delete the user.";
            }
        }
        return "The id is invalid for the user.";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        if(user != null) {
            userService.update(user);
            return "User updated";
        } else {
            return "Request does not contain a body";
        }
    }
}
