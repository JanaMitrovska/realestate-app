package com.realestate.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "v_prodadeni_imoti")
public class prodadeni_imoti {

    @Id
    @Column(name = "i_id")
    private Long i_id;

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "kvadratura")
    private String kvadratura;

    @Column(name = "tip_imot")
    private String tip_imot;

    @Column(name = "datum_prodazba")
    private Date datum_prodazba;

    @Column(name = "cena")
    private Double cena;

    @Column(name = "vraboten")
    private String vraboten;

    @Column(name = "sopstvenik")
    private String sopstvenik;

    @Column(name = "ime_grad")
    private String ime_grad;


}
