package com.absjrdev.maxvendas.user.application;

import com.absjrdev.maxvendas.user.domain.User;
import com.absjrdev.maxvendas.user.repository.UserRepository;
import org.apache.el.lang.ELArithmetic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class UserService {

    @Autowired
    UserRepository userRepository;

    public
    List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }
}
