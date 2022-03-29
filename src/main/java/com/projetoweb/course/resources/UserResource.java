package com.projetoweb.course.resources;

import com.projetoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = User.builder()
                .id(1l)
                .email("maria@email.com")
                .name("Maria")
                .phone("33999994444")
                .password("1234")
                .build();

        return ResponseEntity.ok().body(user);
    }
}
