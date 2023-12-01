package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findByNameClient(String name);
}
