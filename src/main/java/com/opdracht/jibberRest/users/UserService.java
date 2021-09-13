package com.opdracht.jibberRest.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component

@Service

public class UserService {
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public List<User> listAll/*getAllUsers*/  (){
  //      return userRepository.findAll();
   // }


    public User get(Long id){
        return userRepository.findById(id).get();
    }

}
