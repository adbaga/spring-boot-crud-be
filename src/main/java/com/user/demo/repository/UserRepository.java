package com.user.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

 List<User> findByUserName(String userName);
}
