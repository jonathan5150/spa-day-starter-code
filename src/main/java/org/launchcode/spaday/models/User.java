package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    private static int nextId = 1;

    private int id;

    @NotBlank
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters.")
    private String username;

    @Email(message = "Invalid email. Please try again.")
    private String email;

    @NotBlank
    @Size(min = 6, message = "Password must be at least 6 characters in length.")
    private String password;

    public User() {
        this.id = nextId;
        nextId++;
    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
