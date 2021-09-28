package com.example.jibberRest.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }
    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @GetMapping("/users/{handle}")
    User one(@PathVariable String handle) {

        return repository.findUserByHandle(handle);
                //.orElseThrow(() -> new UserNotFoundException(handle));
    }





/*
    final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers  (){
        return userService.getAllUsers();
    }

 */
}
