package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "grad")
@Data
public class Grad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g_id")
    private Integer g_id;

    @Column(name = "ime_grad")
    private String ime_grad;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grad")
    private Set<Imot> gradovi;

}
