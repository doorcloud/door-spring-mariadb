package com.example.door_spring_mariadb.repository;

import com.example.door_spring_mariadb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
