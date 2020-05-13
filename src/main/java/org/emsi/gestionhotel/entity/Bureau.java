package org.emsi.gestionhotel.entity;

import javax.persistence.Entity;

@Entity
public class Bureau extends Espace {
    private int nbrTable;

	public int getNbrTable() {
		return nbrTable;
	}

	public void setNbrTable(int nbrTable) {
		this.nbrTable = nbrTable;
	}
    
    
}
