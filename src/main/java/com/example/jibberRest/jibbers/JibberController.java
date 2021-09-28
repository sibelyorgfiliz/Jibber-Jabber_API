package com.example.jibberRest.jibbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JibberController {

    final JibberService jibberService;

    @Autowired
    public JibberController(JibberService jibberService) {

        this.jibberService = jibberService;

    }


    @GetMapping("/jibbers")
    public List<Jibber> getAllJibbers (){

        return jibberService.getAllJibbers();

    }
}
