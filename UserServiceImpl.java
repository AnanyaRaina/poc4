package com.javaspring.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.Entity.User;
import com.javaspring.Repository.UserRepository;
import com.javaspring.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // @Override
    // public User saveUser(User user) {
    // return userRepository.save(user);
    // }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // @Override
    // public User updateUser(Long id, User user) {
    // Optional<User> findById = userRepository.findById(id);
    // if (findById.isPresent()) {
    // User userEntity = findById.get();
    // if (user.getName() != null && !user.getName().isEmpty())
    // userEntity.setName(user.getName());
    // if (user.getAge() != 0)
    // userEntity.setAge(user.getAge());
    // return userRepository.save(userEntity);
    // }
    // return null;
    // }

    // @Override
    // public void deleteUser(Long id) {
    // userRepository.deleteById(id);
    // }

}
