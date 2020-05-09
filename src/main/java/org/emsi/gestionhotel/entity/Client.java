package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends Utilisateur {
	// compte Paypal
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<ComptePaypal> comptePaypals;
	
	// reservation 
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Reservation> reservations ;
}
