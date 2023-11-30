package com.sk.mediatechspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class BillProdQuantity implements Serializable {
    @EmbeddedId
    private BillProdKey billProdKey;
    @MapsId(value="productId")
    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    @MapsId(value="billId")
    @ManyToOne
    @JoinColumn(name="bill_id")
    private Bill bill;
    @Column(name = "quantity_product")
    private  Double quantityProd;

}
