package com.spring.springrest.services;
import com.spring.springrest.dao.UserDao;
import com.spring.springrest.entities.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceProvider implements UserService{
    @Autowired
    private UserDao userdao;

    @Override
    public List<UserDetails> getUserDetails( Long organisationId) {

        return userdao.findAll();
    }


    @Override
    public UserDetails addUserDetails(UserDetails userdetails) {
        userdao.save(userdetails);
        return userdetails;

    }




}
