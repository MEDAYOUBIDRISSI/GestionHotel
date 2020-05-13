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
	public int getNbrLit() {
		return nbrLit;
	}
	public void setNbrLit(int nbrLit) {
		this.nbrLit = nbrLit;
	}
	public int getNbrSalledeBain() {
		return nbrSalledeBain;
	}
	public void setNbrSalledeBain(int nbrSalledeBain) {
		this.nbrSalledeBain = nbrSalledeBain;
	}
	public CategorieChambre getCategorieC() {
		return categorieC;
	}
	public void setCategorieC(CategorieChambre categorieC) {
		this.categorieC = categorieC;
	}
    
    
}
