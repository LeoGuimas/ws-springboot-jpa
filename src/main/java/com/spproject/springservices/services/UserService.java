package com.spproject.springservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spproject.springservices.entities.User;
import com.spproject.springservices.repositories.UserRepository;

@Service
public class UserService {
    
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    
    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
