package com.example.jibberRest.jibbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jibbers")
public class JibberController {

    private final JibberService jibberService;

    @Autowired
    public JibberController(JibberService jibberService) {
        this.jibberService = jibberService;
    }

    @GetMapping
    public List<Jibber> allUser  (){
        return jibberService.allJibbers();
    }


}
