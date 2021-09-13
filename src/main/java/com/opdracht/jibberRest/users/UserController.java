package com.opdracht.jibberRest.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/users")
public class UserController {
   @Autowired
    private final UserRepository userRepository;
 /*
    @Autowired
    private final UserService userService;

  */

    @Autowired
    public UserController(UserRepository userRepository/*, UserService userService*/) {
        this.userRepository = userRepository;
       // this.userService = userService;
    }

    @GetMapping("/users")
    List<User> list(){
        return userRepository.findAll();
        //return userService.listAll();
    }

    @GetMapping("/Users/{id}")
    User oneUser(@PathVariable Long id) {

        return userRepository.findById(id).get();
               // .orElseThrow(() -> new UserNotFoundException(id));
    }
/*
    @GetMapping("/users/{id}")
    User getById(@PathVariable Long id) {
        return userService.get(id);
    }

 */

}
