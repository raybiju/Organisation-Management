package com.spring.springrest.services;
import com.spring.springrest.entities.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<UserDetails> getUserDetails(Long organisationId);
    public UserDetails addUserDetails(UserDetails userdetails);
}
