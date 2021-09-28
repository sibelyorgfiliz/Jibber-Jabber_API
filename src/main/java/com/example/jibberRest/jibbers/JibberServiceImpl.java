package com.example.jibberRest.jibbers;


import com.example.jibberRest.users.User;
import com.example.jibberRest.users.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JibberServiceImpl implements JibberService {


    final JibberRepository jibberRepository;

    public JibberServiceImpl(JibberRepository jibberRepository) {
        super();
        this.jibberRepository = jibberRepository;
    }

    @Override
    public List<Jibber> getAllJibbers() {
        return jibberRepository.findAll();
    }

    @Override
    public Jibber getJibber(Long id){
        return jibberRepository.findJibberById(id);
    }
}
