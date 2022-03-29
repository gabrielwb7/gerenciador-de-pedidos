package com.projetoweb.course.config;

import com.projetoweb.course.entities.Order;
import com.projetoweb.course.entities.User;
import com.projetoweb.course.repositories.OrderRepository;
import com.projetoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Autowired
    private OrderRepository orderRepository;

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

        Order orderOne = Order.builder().moment(Instant.parse("2019-06-20T19:53:07Z")).client(user).build();
        Order orderTwo = Order.builder().moment(Instant.parse("2022-02-20T18:33:44Z")).client(userTwo).build();
        Order orderThree = Order.builder().moment(Instant.parse("2021-04-20T20:54:27Z")).client(user).build();

        repository.saveAll(Arrays.asList(user, userTwo));
        orderRepository.saveAll(Arrays.asList(orderOne, orderTwo, orderThree));
    }
}
