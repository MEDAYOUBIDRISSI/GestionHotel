package org.emsi.gestionhotel.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Chambre extends Espace {
    private int nbrLit;
    private int nbrSalledeBain;
    // cATEGORIE cHAMBRE
    @ManyToOne
    private CategorieChambre categorieC;
}
