package org.emsi.gestionhotel.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DateTacheKey implements Serializable{
	private int employe;
    private int tache;
    @Temporal(TemporalType.DATE)
    private Date dateTache;
	public int getEmploye() {
		return employe;
	}
	public void setEmploye(int employe) {
		this.employe = employe;
	}
	public int getTache() {
		return tache;
	}
	public void setTache(int tache) {
		this.tache = tache;
	}
	public Date getDateTache() {
		return dateTache;
	}
	public void setDateTache(Date dateTache) {
		this.dateTache = dateTache;
	}
	public DateTacheKey(int employe, int tache, Date dateTache) {
		super();
		this.employe = employe;
		this.tache = tache;
		this.dateTache = dateTache;
	}
	public DateTacheKey() {
		super();
		// TODO Auto-generated constructor stub
	}
}
