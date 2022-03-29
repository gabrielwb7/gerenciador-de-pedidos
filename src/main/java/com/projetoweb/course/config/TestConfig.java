package com.projetoweb.course.config;

import com.projetoweb.course.entities.User;
import com.projetoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .email("maria@email.com")
                .name("Maria")
                .phone("33999994444")
                .password("1234")
                .build();
        User userTwo = User.builder()
                .email("joao@email.com")
                .name("Joao")
                .phone("33888881111")
                .password("1234")
                .build();

        repository.saveAll(Arrays.asList(user, userTwo));
    }
}
