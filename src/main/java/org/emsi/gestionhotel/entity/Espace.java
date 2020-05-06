package org.emsi.gestionhotel.entity;

import javax.persistence.*;

@Entity
public class Espace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float prix;
    private String description;

}
