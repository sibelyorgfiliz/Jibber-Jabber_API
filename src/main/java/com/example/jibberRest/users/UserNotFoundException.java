package com.example.jibberRest.users;

public class UserNotFoundException extends RuntimeException {

    UserNotFoundException(String handle) {
        super("Could not find employee " + handle);
    }
}
