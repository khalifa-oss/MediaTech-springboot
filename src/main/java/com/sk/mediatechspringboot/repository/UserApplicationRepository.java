package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.UserApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserApplicationRepository extends JpaRepository<UserApplication, Long> {
}
