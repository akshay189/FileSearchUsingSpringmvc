package com.java.dao;

import com.java.models.Users;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    @SuppressWarnings("unchecked")
    public Users findByUserName(String username) {
        List<Users> users = new ArrayList<>();
        users = getSessionFactory().getCurrentSession().createQuery("from " +
                "Users where username = ?").setParameter(0,username).list();
        if(users.size() > 0)
        {
            return users.get(0);
        }
        else
        {
            return null;
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
