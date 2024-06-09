package com.scm.service;


import java.util.List;
import java.util.Optional;

import com.scm.entity.User;

public interface UserService {


    User saveUser(String id);
    Optional<User> getUserById(String id);
    Optional<User> updateUserById(User user);
    List<User> getAllUser();
    User deleteUserById(String id);


    boolean isUserExist(String  id);
    boolean isUserExistByEmail(String email);


}
