package com.opdracht.jibberRest.users;

//import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String handle;

    public User() {}

    public User(Long id, String handle){
        this.id = id;
        this.handle = handle;
    }

    public User(String handle){
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