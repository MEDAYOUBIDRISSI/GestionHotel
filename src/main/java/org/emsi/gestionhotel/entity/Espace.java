package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Espace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float prix;
    private String description;
    
    // Image
    @OneToMany(mappedBy = "espace", cascade = CascadeType.ALL)
    private List<Image> images ;
    
    // reservation
    @OneToMany(mappedBy = "espace", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

}
