package com.maxdegree.model;

import java.util.List;

/**
 * Created by gms on 11.12.2015.
 */
public class User {

    private Integer userId;
    private String login;
    private String password;
    private String email;
    private String role;
    private List<Placement> places;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Placement> getPlaces() {
        return places;
    }

    public void setPlaces(List<Placement> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "User{" + ", userID=" + userId + "Login=" + login + ", password=" + password + ", email=" +email + ", role=" + role;
    }
}
