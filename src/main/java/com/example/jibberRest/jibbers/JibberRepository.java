package com.example.jibberRest.jibbers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JibberRepository extends JpaRepository <Jibber, Long> {

    Jibber findJibberById(Long id);

    @Query("from Jibber j join fetch User u on j.user = u where u.handle = :handle order by j.createdDate desc")
    List<Jibber> findByHandle(String handle);
}
