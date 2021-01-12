package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "kupuvac")
@Data
public class Kupuvac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "embg")
    private String embg;

    @ManyToOne
    @JoinColumn(name = "p_id", nullable = false)
    private Prodazna_kancelarija kancelarija;

}
