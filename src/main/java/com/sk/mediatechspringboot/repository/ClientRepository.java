package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
