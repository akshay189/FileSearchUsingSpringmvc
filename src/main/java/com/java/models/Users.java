package com.java.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;


public class Users
{
    private String username;
    private String password;
    private String userroles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }
}
