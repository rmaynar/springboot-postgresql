package com.maynar.poc01.service.impl;

import com.maynar.poc01.dao.IUserDAO;
import com.maynar.poc01.model.User;
import com.maynar.poc01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDao;

    @Override
    public User create(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean update(User user) {
        try{
            userDao.save(user);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public User findById(Long id) {
        Optional<User> result = userDao.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public List<User> findAll() {
        return (List<User>)userDao.findAll();
    }

    @Override
    public boolean delete(Long id) {
        try {
            userDao.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
