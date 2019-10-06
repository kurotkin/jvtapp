package com.kurotkin.jvtapp.repository;

import com.kurotkin.jvtapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
