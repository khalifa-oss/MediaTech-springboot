package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
