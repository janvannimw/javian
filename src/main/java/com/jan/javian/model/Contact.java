package com.jan.javian.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CONTACT")
@Getter
@Setter
@ToString
public class Contact {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, length = 30)
    private String firstName;
    @Column(nullable = false, length = 30)
    private String lastName;
    @Column(nullable = false, length = 50)
    private String email;
    @Column
    private long phoneNumber;
    @Column(length = 250)
    private String description;

    public Contact(){

    }

    public Contact(String firstName, String lastName, String email, long phoneNumber, String description){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

}
