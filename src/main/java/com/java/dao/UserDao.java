package com.java.dao;

import com.java.models.*;


public interface UserDao
{
    Users findByUserName(String username);
}
