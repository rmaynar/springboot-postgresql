package com.maynar.poc01.service;

import com.maynar.poc01.model.User;

import java.util.List;

public interface IUserService {

    public User create(User user);

    public boolean update(User user);

    public User findById(Long id);

    public List<User> findAll();

    public boolean delete(Long id);
}
