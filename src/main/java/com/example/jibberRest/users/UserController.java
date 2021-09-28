package com.example.jibberRest.users;

import com.example.jibberRest.jibbers.Jibber;
import com.example.jibberRest.jibbers.JibberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    private final UserRepository repository;
    private final JibberRepository jibberRepository;

    UserController(UserRepository repository, JibberRepository jibberRepository) {
        this.repository = repository;
        this.jibberRepository=jibberRepository;
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

    @GetMapping("/users/{handle}/jibbers")
    List <Jibber> getAllJibbersForOneUser(@PathVariable String handle){

        return jibberRepository.findByHandle(handle);

    }
}
