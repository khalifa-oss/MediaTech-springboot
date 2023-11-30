package com.sk.mediatechspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProduct;
    @Column(name = "ref_product")
    private String refProduct;
    @Column (nullable = false,name= "label_product")
    private String  labelProduct;
    @Column(nullable = false)
    private Double priceProduct;
    @Column(nullable = false)
    private Long quantityProduct;

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<BillProdQuantity> billProdQuantitySet =new HashSet<>();

//    @ManyToMany (mappedBy = "products")
//    private Set<Bill> bills = new LinkedHashSet<>();

}

