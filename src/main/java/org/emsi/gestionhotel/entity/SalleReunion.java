package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class SalleReunion  extends Espace{

    private int nbrChaise;

	public int getNbrChaise() {
		return nbrChaise;
	}

	public void setNbrChaise(int nbrChaise) {
		this.nbrChaise = nbrChaise;
	}

	

	public SalleReunion(long id, float prix, String description, List<Image> images, List<Reservation> reservations,
			int nbrChaise) {
		super(id, prix, description, images, reservations);
		this.nbrChaise = nbrChaise;
	}
    
    
}
