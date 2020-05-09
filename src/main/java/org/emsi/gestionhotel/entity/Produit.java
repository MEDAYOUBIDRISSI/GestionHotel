package org.emsi.gestionhotel.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle;
	private float prix;
	@OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private Set<LigneCmd> ligneCmds;
	
	// Image
    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL)
    private List<Image> images ;
    
	
}
