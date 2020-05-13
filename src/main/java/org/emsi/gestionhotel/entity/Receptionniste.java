package org.emsi.gestionhotel.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Receptionniste extends Employe {
	
		// reservation 
		@OneToMany(mappedBy = "receptionniste", cascade = CascadeType.ALL)
	    private List<Reservation> reservations ;

		public List<Reservation> getReservations() {
			return reservations;
		}

		public void setReservations(List<Reservation> reservations) {
			this.reservations = reservations;
		}

		
}
