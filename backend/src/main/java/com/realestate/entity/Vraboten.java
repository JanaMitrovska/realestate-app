package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vraboten")
@Data
public class Vraboten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "embg")
    private String embg;

    @Column(name = "rabotno_mesto")
    private String rabotno_mesto;

    @Column(name = "plata")
    private Long plata;

    @Column(name = "broj_dogovor")
    private String broj_dogovor;

    @Column(name = "datum_vrabotuvanje")
    private Date datum_vrabotuvanje;

    @ManyToOne
    @JoinColumn(name = "p_id", nullable = false)
    private Prodazna_kancelarija kancelarija;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vraboten")
    private Set<Imot> vraboteni;

}