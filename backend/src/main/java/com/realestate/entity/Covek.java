package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "covek")
@Data
public class Covek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "embg")
    private String embg;

    @Column(name = "ime")
    private String ime;

    @Column(name = "prezime")
    private String prezime;

    @Column(name = "email")
    private String email;

    @Column(name = "telefonski_broj")
    private String telefonski_broj;

}
