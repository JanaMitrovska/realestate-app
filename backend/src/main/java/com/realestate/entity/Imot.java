package com.realestate.entity;

import lombok.Data;

import java.util.Set;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "imot")
@Data
public class Imot{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_id")
    private Long i_id;

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "kvadratura")
    private String kvadratura;

    @Column(name = "tip_imot")
    private String tip_imot;

    @Column(name = "rata")
    private Long rata;

    @Column(name = "prodaden")
    private Boolean prodaden;

    @Column(name = "datum_prodazba")
    private Date datum_prodazba;

    @Column(name = "cena")
    private Double cena;

    @ManyToOne
    @JoinColumn(name = "embg_sopstvenik", nullable = false)
    private Sopstvenik sopstvenik;

    @ManyToOne
    @JoinColumn(name = "embg_vraboten", nullable = false)
    private Vraboten vraboten;

    @ManyToOne
    @JoinColumn(name = "g_id", nullable = false)
    private Grad grad;



}