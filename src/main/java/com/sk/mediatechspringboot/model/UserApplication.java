package com.sk.mediatechspringboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table (name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserApplication implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String username;
    @Column(nullable = false)
    @Size(min = 7)
    private String password;

    @ManyToMany (cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable (name = "users_roles",
            joinColumns = @JoinColumn (name = "userApplication_id"),
            inverseJoinColumns = @JoinColumn (name = "roles_id"))
    private Set<Role> roles = new LinkedHashSet<>();


    @OneToOne (mappedBy = "userApplication", orphanRemoval = true)
    private UserProfile userProfile;

}
