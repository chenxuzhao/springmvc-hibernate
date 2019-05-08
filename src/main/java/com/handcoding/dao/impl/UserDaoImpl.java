package com.handcoding.dao.impl;

import com.handcoding.dao.UserDao;
import com.handcoding.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("UserDao")
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public long addUser(User user)
    {
        Session session = sessionFactory.getCurrentSession();

        Long id = null;

        try
        {

            id = (Long)session.save(user);
            return id;

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }finally {
            // session.close();
        }
    }
}
