package com.traini8.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Entity
public class TrainingCenter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    private String centerCode;

    @Embedded
    private Address address;

    @Min(1)
    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Long createdOn;

    @Email
    private String contactEmail;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$")
    private String contactPhone;

    // Getters and Setters
}