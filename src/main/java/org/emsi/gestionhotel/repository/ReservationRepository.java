package org.emsi.gestionhotel.repository;

import org.emsi.gestionhotel.entity.Image;
import org.emsi.gestionhotel.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
	public  Reservation findById(long id);
}
