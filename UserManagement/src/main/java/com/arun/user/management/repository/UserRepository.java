package com.arun.user.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.arun.user.management.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
