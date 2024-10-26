package com.maska.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String membershipNumber;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String identificationDocument;

    @Column(nullable = false)
    private String nationality;

    @Column(nullable = false)
    private LocalDate membershipDate;

    @Column(nullable = false)
    private LocalDate licenseExpirationDate;

    // Default constructor
    public Member() {}

    // Constructor with all fields
    public Member(Long id, String membershipNumber, String lastName, String firstName, String identificationDocument, String nationality,  LocalDate membershipDate, LocalDate licenseExpirationDate) {
        this.id = id;
        this.membershipNumber = membershipNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.identificationDocument = identificationDocument;
        this.nationality = nationality;
        this.membershipDate = membershipDate;
        this.licenseExpirationDate = licenseExpirationDate;
    }

    @Override
    public String toString() {
        return "Member{ " +
                "id= " + id +
                ", membershipNumber=' " + membershipNumber + '\'' +
                ", lastName=' " + lastName + '\'' +
                ", firstName=' " + firstName + '\'' +
                ", identificationDocument=' " + identificationDocument + '\'' +
                ", nationality=' " + nationality + '\'' +
                ", membershipDate= " + membershipDate +
                ", licenseExpirationDate= " + licenseExpirationDate +
                '}';
    }
}
