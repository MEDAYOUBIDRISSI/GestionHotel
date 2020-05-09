package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Serveur extends Employe {
	// reservation 
	@OneToMany(mappedBy = "serveur", cascade = CascadeType.ALL)
    private List<Reservation> reservations ;
}
