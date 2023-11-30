package com.sk.mediatechspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Table (name = "user_profile")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserProfile implements Serializable {
    @Id
    private Long id;
    private String avatar;
    private String phone;

    @OneToOne (cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn (name = "user_application_id", nullable = false)
    private UserApplication userApplication;

}
