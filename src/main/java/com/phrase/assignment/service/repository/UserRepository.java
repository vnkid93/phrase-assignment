package com.phrase.assignment.service.repository;

import com.phrase.assignment.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
