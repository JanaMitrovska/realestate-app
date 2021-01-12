package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sopstvenik")
@Data
public class Sopstvenik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "embg")
    private String embg;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sopstvenik")
    private Set<Imot> sopstvenici;


}