package com.kurotkin.jvtapp.repository;

import com.kurotkin.jvtapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String name);
}
