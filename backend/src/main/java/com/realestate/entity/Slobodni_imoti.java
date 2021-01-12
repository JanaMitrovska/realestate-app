package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "v_slobodni_imoti")
public class Slobodni_imoti {

    @Id
    @Column(name = "i_id")
    private Long i_id;

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "kvadratura")
    private String kvadratura;

    @Column(name = "tip_imot")
    private String tip_imot;

    @Column(name = "cena")
    private Double cena;

    @Column(name = "ime_grad")
    private String ime_grad;


}
