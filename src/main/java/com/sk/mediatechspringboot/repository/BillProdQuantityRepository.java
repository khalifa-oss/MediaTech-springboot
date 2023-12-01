package com.sk.mediatechspringboot.repository;

import com.sk.mediatechspringboot.model.BillProdKey;
import com.sk.mediatechspringboot.model.BillProdQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillProdQuantityRepository extends JpaRepository<BillProdQuantity, BillProdKey> {
}
