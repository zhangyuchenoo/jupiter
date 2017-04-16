package com.jupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jupiter.model.JUser;

public interface UserDao extends JpaRepository<JUser,Long> {

}
