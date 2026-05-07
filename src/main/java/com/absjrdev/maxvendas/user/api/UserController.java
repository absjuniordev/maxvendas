package com.absjrdev.maxvendas.user.api;

import com.absjrdev.maxvendas.user.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L,"Fau", "fau@gmail", "99999","1234");
        return ResponseEntity.ok().body(user);
    }
}
