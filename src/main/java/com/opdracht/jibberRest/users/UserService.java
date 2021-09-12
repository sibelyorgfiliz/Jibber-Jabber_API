package com.opdracht.jibberRest.users;


//import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> allUsers  (){
        return userRepository.findAll();
    }
    public User get(Long id){
        return userRepository.getById(id);
    }

}
