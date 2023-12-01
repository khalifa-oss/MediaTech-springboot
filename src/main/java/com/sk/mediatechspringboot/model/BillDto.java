package com.sk.mediatechspringboot.model;

import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Bill}
 */
@Value
public class BillDto implements Serializable {
    @Size
    String billRef;
}
