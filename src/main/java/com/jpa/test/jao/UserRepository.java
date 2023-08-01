package com.jpa.test.jao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
