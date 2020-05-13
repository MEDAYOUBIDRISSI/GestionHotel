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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getTotalPrix() {
		return totalPrix;
	}

	public void setTotalPrix(float totalPrix) {
		this.totalPrix = totalPrix;
	}

	public Date getDateFacturation() {
		return dateFacturation;
	}

	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}

	public ComptePaypal getComptepaypal() {
		return comptepaypal;
	}

	public void setComptepaypal(ComptePaypal comptepaypal) {
		this.comptepaypal = comptepaypal;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
}
