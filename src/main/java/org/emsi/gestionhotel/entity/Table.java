package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@javax.persistence.Table(name="tabls")
public class Table {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private int nbPlace;
	
	// reservation
	@ManyToMany
	private List<Reservation> reservations;
	
}
