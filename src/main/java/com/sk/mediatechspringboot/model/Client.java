package com.sk.mediatechspringboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column(nullable = false)
    private String  codeClient;
    @Column(nullable = false)
    private String nameClient;
    @Column(nullable = false)
    private String firstNameClient;
    @Column(name = "phone_client")
    @Length(min = 8,max = 8)
    private String phoneClient;

    @OneToMany (mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Bill> bills = new LinkedHashSet<>();


}
