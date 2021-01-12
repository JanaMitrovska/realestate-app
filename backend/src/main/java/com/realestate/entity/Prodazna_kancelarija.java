package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "prodazna_kancelarija")
@Data
public class Prodazna_kancelarija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Integer p_id;

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "fax")
    private String fax;

    @Column(name = "email")
    private String email;

    @Column(name = "kontakt_broj")
    private String kontakt_broj;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kancelarija")
    private Set<Vraboten> vraboten;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kancelarija")
    private Set<Kupuvac> kupuvac;
}
