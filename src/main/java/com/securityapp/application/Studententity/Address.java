package com.securityapp.application.Studententity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address {
   // @ManyToOne
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(Long id, String street, String city, String state, String zipCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

   // @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "student_id",referencedColumnName = "id")
    private StudentInformation studentInformation;
}
