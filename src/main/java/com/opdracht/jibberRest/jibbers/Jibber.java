package com.opdracht.jibberRest.jibbers;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Jibber {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String handle;

    public Jibber() {}

    public Jibber(Long id, String handle){
        this.id = id;
        this.handle = handle;
    }

    public Jibber(String handle){
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", handle='" + handle + '\'' +
                '}';
    }
}