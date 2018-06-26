package com.java.service;


import com.java.dao.UserDao;
import com.java.models.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyUserDetailsService implements UserDetailsService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userDao.findByUserName(username);
        return buildUserForAuthentication(user);
    }

    private User buildUserForAuthentication(Users user) {
        return new User(user.getUsername(), "{noop}" + user.getPassword(), true, true, true, true, castUserRoleType(user));
    }

    private Set<GrantedAuthority> castUserRoleType(Users user) {
        Set<GrantedAuthority> authoritySet = new HashSet<>();
        authoritySet.add(new SimpleGrantedAuthority(user.getUserroles()));
        return authoritySet;
    }
}
