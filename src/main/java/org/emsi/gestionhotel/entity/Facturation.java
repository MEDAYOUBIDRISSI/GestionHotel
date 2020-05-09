package org.emsi.gestionhotel.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facturation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private float totalPrix;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFacturation;
	
	// compte Paypale
	@ManyToOne(fetch = FetchType.LAZY)
    private ComptePaypal comptepaypal;
	
	// Reservation
	@OneToOne(fetch = FetchType.LAZY)
	private Reservation reservation;
}
