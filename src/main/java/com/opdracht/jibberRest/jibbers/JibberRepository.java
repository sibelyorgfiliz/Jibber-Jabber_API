package com.opdracht.jibberRest.jibbers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JibberRepository extends JpaRepository <Jibber, Long> {


}
