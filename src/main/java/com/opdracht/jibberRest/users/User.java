package com.opdracht.jibberRest.users;

//import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;


@Entity
@Setter
public class User {


    private Long id;
    private String email;
    private String handle;
    private String passWord;

    public User() {}

    public User(Long id, String handle){
    this.id = id;
    this.handle = handle;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getHandle() {
        return handle;
    }

    public String getEmail() {
        return email;
    }

    public String getPassWord() {
        return passWord;
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