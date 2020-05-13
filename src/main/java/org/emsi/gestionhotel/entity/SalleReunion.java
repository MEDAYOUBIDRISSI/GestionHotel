package org.emsi.gestionhotel.entity;

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
    
    
}
