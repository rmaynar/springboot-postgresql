package com.maynar.poc01.dao;

import com.maynar.poc01.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDAO extends CrudRepository<User, Long> {

}
