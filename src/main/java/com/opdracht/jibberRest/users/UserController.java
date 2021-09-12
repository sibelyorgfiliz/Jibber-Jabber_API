package com.opdracht.jibberRest.users;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController implements CommandLineRunner {

    private final UserService userService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<User> allUsers  (){
        return userService.allUsers();
    }

    @GetMapping("/users/{id}")
    public User getTasks(@PathVariable Long id) {
        return userService.get(id);
    }


    @Override
    public void run(String... args) throws Exception {
        String sql=("SELECT * FROM users");
    }
}
