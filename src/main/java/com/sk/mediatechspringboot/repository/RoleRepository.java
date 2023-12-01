package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
