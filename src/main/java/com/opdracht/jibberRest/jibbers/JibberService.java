package com.opdracht.jibberRest.jibbers;


//import org.springframework.stereotype.Component;
import com.opdracht.jibberRest.users.User;
import com.opdracht.jibberRest.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class JibberService {

    private final JibberRepository jibberRepository;

    @Autowired
    public JibberService(JibberRepository jibberRepository) {
        this.jibberRepository = jibberRepository;
    }

  //  public List<Jibber> allJibbers  (){
//        return jibberRepository.findAll();
   // }
}
