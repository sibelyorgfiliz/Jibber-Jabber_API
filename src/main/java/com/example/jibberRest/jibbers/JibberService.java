package com.example.jibberRest.jibbers;


import java.util.List;

public interface JibberService {
    List <Jibber> getAllJibbers ();
    Jibber getJibber(Long id);
}
