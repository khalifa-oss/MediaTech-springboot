package com.sk.mediatechspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "bills")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bill  implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idBill;
    @Column(nullable = false,name= "reference_bill")
    private String  billRef;
    @Column(nullable = false)
    private Date nameClient;

    @ManyToOne
    @JoinColumn (name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "bill",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private  Set<BillProdQuantity> billProdQuantitySet = new HashSet<>();


//    @ManyToMany
//    @JoinTable (name = "bills_products",
//            joinColumns = @JoinColumn (name = "bill_idBill"),
//            inverseJoinColumns = @JoinColumn (name = "products_idProduct"))
//    private Set<Product> products = new LinkedHashSet<>();

}
