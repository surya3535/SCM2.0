package com.scm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.entity.User;

@Repository 
public interface UserRepository extends JpaRepository<User, String> {

//custom finder method
    //custom query method
}
