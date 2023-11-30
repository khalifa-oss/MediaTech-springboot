package com.sk.mediatechspringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Embeddable@Data
@AllArgsConstructor
@NoArgsConstructor
public class BillProdKey implements Serializable {
    @Column(name="bill_id")
    private Long billId;
    @Column(name="product_id")
    private Long productId;

}
