package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
