package com.realestate.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Stan")
@Data
public class Stan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Integer g_id;

    @Column(name = "ima_parno")
    private Boolean ima_parno;

}
