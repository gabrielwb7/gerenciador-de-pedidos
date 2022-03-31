package com.projetoweb.course.services;

import com.projetoweb.course.entities.User;
import com.projetoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);
        return user.get();
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id, User newData) {
        User user = repository.getById(id);
        updateData(user, newData);
        return repository.save(user);
    }

    private void updateData(User user, User newData) {
        user.setName(newData.getName());
        user.setEmail(newData.getEmail());
        user.setPhone(newData.getPhone());
    }


}
