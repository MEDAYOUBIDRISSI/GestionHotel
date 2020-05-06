package org.emsi.gestionhotel.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CategorieChambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    @OneToMany(mappedBy = "categorieC")
    private List<Chambre> chambres;
}
