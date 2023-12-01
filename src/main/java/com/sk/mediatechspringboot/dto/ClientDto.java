package com.sk.mediatechspringboot.dto;

import lombok.Value;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * DTO for {@link com.sk.mediatechspringboot.model.Client}
 */
@Value
public class ClientDto implements Serializable {
    Long idClient;
    String codeClient;
    String nameClient;
    String firstNameClient;
    @Length (min = 8, max = 8)
    String phoneClient;
}
