package com.example.workoutsadad.customer;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CustomerEntity {

    private Long id;
    private String firstname;
    private String lastname;
    private String ssn;

}
