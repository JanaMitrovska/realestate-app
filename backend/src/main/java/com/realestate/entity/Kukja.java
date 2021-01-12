package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "kukja")
@Data
public class Kukja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "k_id")
    private Integer g_id;

    @Column(name = "broj_sprata")
    private Long broj_sprata;

}
