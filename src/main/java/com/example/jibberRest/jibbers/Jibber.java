package com.example.jibberRest.jibbers;


import com.example.jibberRest.users.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="jibbers")
public class Jibber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public Jibber() { };

    public Jibber(Long id, String message, Date createdDate) {
        this.id = id;
        this.message = message;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jibber jibber = (Jibber) o;
        return Objects.equals(id, jibber.id) && Objects.equals(message, jibber.message) && Objects.equals(createdDate, jibber.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message, createdDate);
    }
}